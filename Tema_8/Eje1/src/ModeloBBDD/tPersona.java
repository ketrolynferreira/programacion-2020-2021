/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBBDD;

import ModeloUML.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author 1gdaw10
 */
public class tPersona {
    private Connection con;


    public tPersona(Connection con) {
        this.con = con;
    }
      // Preparar y ejecutar  Sentencias sql
    public void insertarPersona(Persona p) throws Exception{
     
       String sentencia="INSERT INTO persona VALUES(?,?,?,?,?);";
       PreparedStatement ps = con.prepareStatement(sentencia);
       
       ps.setString(1, p.getDni());
       ps.setString(2, p.getNombre());
       ps.setString(3,p.getEdad());
       ps.setString(4, p.getProfesion());
       ps.setString(5, p.getTelefono());
       
       int fila=ps.executeUpdate();
       ps.close();
       if(fila!=1){
           throw new Exception("El número de filas actualizadas no es uno");
       }
       
       
   } 
    
    public Persona consultarPersona(String dni)throws Exception{
        Persona p=null;
        
        PreparedStatement sentencia = con.prepareStatement("SELECT * FROM persona WHERE dni=?;");
        sentencia.setString(1, dni);
        ResultSet res= sentencia.executeQuery();
      
        if(res.next()){
            p = new Persona();
            p.setDni(res.getString("dni"));
            p.setNombre(res.getString("nombre"));
            p.setEdad(res.getString("edad"));
            p.setProfesion(res.getString("profesion"));
            p.setTelefono(res.getString("telefono"));
        }else
            throw new Exception("Persona no encontrada");
        
        res.close();
        sentencia.close();
        return p;
    }
    
    public void borrarPersona(Persona p)throws Exception{
        String sentencia="DELETE FROM persona where DNI=?; ";
        PreparedStatement ps = con.prepareStatement(sentencia);
        ps.setString(1, p.getDni());
        
        int fila=ps.executeUpdate();
        ps.close();
        if(fila!=1){
            throw new Exception ("Más de una fila borrado");
        }
    }
    
    public ArrayList<Persona> consultarPersonas()throws Exception{
    ArrayList<Persona> aListaPersonas = new ArrayList();
    Statement consulta = con.createStatement();
    ResultSet res = consulta.executeQuery("SELECT * FROM personas");
    
    while(res.next()){
        Persona p=new Persona();
        p.setDni(res.getString("dni"));
        p.setNombre(res.getString("nombre"));
        p.setEdad(res.getString("edad"));
        p.setProfesion(res.getString("profesion"));
        p.setTelefono(res.getString("telefono"));
        aListaPersonas.add(p);
        
    }
    res.close();
    consulta.close();
    
    return aListaPersonas;
    
    }
}

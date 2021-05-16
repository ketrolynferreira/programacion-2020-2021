/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBD;

import ClasesUML.Asunto;
import ClasesUML.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ketro
 */
public class tasunto {

    private Connection con;

    public tasunto() {
    }

    public tasunto(Connection con) {
        this.con = con;
    }

    public void altaAsunto(Asunto asunto) throws Exception {
        String sentenca = "INSERT INTO tasunto Values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sentenca);
        ps.setString(1, String.valueOf(asunto.getNumeroArchivo()));
        ps.setString(2, asunto.getFechaI());
        ps.setString(3, asunto.getFechaF());
        ps.setString(4, asunto.getEstado());
        ps.setString(5, String.valueOf(asunto.getIdCliente()));

        int n = ps.executeUpdate();
        if (n != 0) {
            throw new Exception("Más de una fila insertada");
        }

    }
    public void borrarAsunto(int  numeroArchivo)throws Exception{
        String sentencia="DELETE FROM tasunto where  numeroArchivo=?";
        PreparedStatement ps= con.prepareStatement(sentencia);
        ps.setString(1, String.valueOf( numeroArchivo));
        
        int n= ps.executeUpdate();
        if(n!=1){
        throw new Exception("Más de una fila borrada");
        }
    }
    public void consultarAsunto(int numeroArchivo) throws Exception{
    String sentencia="Select * from tasunto where  numeroArchivo=?";
    PreparedStatement ps=con.prepareStatement(sentencia);
    ps.setString(1,  String.valueOf(numeroArchivo));
    
    ResultSet resultado =ps.executeQuery();
    if(resultado.next()){
    Asunto a= new Asunto();
    a.setNumeroArchivo(resultado.getShort(String.valueOf(numeroArchivo)));
    a.setFechaI(resultado.getString(sentencia));
    a.getFechaF();
    
    }
    
    
    }
}

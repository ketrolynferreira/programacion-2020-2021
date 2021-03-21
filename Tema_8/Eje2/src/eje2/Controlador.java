
package eje2;

import BaseDeDatos.*;
import MisClases.*;
import Tablas.*;
import Ventanas.*;
import java.time.*;
import static javax.swing.JOptionPane.*;

public class Controlador {
    private static VentanaPrincipal vp;
    private static VentanaAcontecimiento va;
    
    private static TablaAcontecimiento ta;
    
    private static Acontecimiento a;
    
    private static BaseDeDatos bd;
    
    public static void main(String[] args) {
        try
        {
            bd = new BaseDeDatos();
            bd.conectar();
            
            ta = new TablaAcontecimiento(bd.getCon());
        
            vp = new VentanaPrincipal();
            vp.setVisible(true);
        }
        catch (Exception e)
        {
            bd.desconectar();
            showMessageDialog(null,e.getMessage());
        }
    }
    
    public static void mostrarv()
    {
        vp.setVisible(false);
        va = new VentanaAcontecimiento(vp,true);
        va.setVisible(true);
    }
    
    public static void salirv(javax.swing.JDialog jd)
    {
        jd.dispose();
        vp.setVisible(true);
    }
    
    public static boolean buscarnombre(String nombre) throws Exception
    {
        a = ta.buscarnombre(nombre);
        return a != null;
        
     
    }
    
    public static boolean comprobarlugar(String lugar,LocalDate fecha,LocalTime hi,LocalTime hf) throws Exception
    {
        a = ta.buscarporlugaruno(lugar, fecha,hi);
        
        if (a!=null)
            return true;
        else
        {
            a = ta.buscarporlugardos(lugar,fecha,hi,hf);
                return a !=null;
           
        }
    }
    
    public static void insertar(String nombre,String lugar,LocalDate fecha,LocalTime hi,LocalTime hf,Integer aforo) throws Exception
    {
        a = new Acontecimiento(nombre,lugar,fecha,hi,hf,aforo);
        ta.insertar(a);
    }
    
    public static void salir()
    {
        bd.desconectar();
        vp.dispose();
    }
}

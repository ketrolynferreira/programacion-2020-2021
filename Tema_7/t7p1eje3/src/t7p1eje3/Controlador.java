/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1eje3;

import Modelo.Persona;
import Vista.AlumnoAntiguo;
import Vista.EntradaDatos;
import Vista.TipoAlumno;
import java.util.ArrayList;

/**
 *
 * @author ketro
 */
public class Controlador {

    private static TipoAlumno vTipoAlumno;
    private static EntradaDatos vAlumnoNuevo;
    private static AlumnoAntiguo vAlumnoAntiguo;
    private static ArrayList<Persona> aListaPersonas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear el array
        aListaPersonas = new ArrayList();
        // Ventana TipoAlumno visible
        vTipoAlumno = new TipoAlumno();
        vTipoAlumno.setVisible(true);
    }

    public static void llamarVentanaAlumnoNuevo() {
        // Borrar la ventana anterior
        vTipoAlumno.dispose();

        // Ventana EntradaDatos
        vAlumnoNuevo = new EntradaDatos();
        vAlumnoNuevo.setVisible(true);
    }

    public static void llamarVentanaAlumnAntiguo() {
        // Borrar la ventana anterior
        vTipoAlumno.dispose();
        vAlumnoAntiguo = new AlumnoAntiguo();
        vAlumnoAntiguo.setVisible(true);
    }

    public static void guardarDatos(String tfdni, String tfnombre, String tfapellidos, String tfCurso) {
        int curso = Integer.parseInt(tfCurso);
        Persona p1 = new Persona(tfdni, tfnombre, tfapellidos, curso);
        aListaPersonas.add(p1);
        vAlumnoNuevo.mensajeCadastro();
    }

    public static void matricularAlumnoAntiguo(String tfdni, String codCurso) {
        for (Persona p : aListaPersonas) {
            if (tfdni == null ? p.getDni() == null : tfdni.equals(p.getDni())) {
               // StringBuffer.append(tfdni);
                vAlumnoAntiguo.mensaje();
            }else{
                llamarVentanaAlumnoNuevo();
            }
        }
    }

    public static void buscarBorrar(String dni) {
        for (Persona p : aListaPersonas) {
            if (dni.equals(p.getDni())) {
                aListaPersonas.remove(p);
            }
        }
    }
    public static void volverVentanaTipo(){
    // Destruir ventanas
        vAlumnoNuevo.dispose();
        // Llamar ventana tipoAlumno
        vTipoAlumno.setVisible(true);
    }
    public static void salir() {
        // Destruir ventanas
        vAlumnoNuevo.dispose();
        // Salir del programa
        System.exit(0);
    }

}

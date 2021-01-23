/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1eje3;

import Modelo.Curso;
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
    private static ArrayList<Curso> aListaCursos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear los cursos
        generarCurso();
        // Crear el array
        aListaPersonas = new ArrayList();
        // Ventana TipoAlumno visible
        vTipoAlumno = new TipoAlumno();
        vTipoAlumno.setVisible(true);
    }

    public static void generarCurso() {
        // Crear arrayListCurso
        aListaCursos = new ArrayList();
        // Crear instancia de la clase curso
        Curso c1 = new Curso(1, "curso1", "Primero", "A");
        // Añadir la Instancia de la clase curso al ArraList de los cursos
        aListaCursos.add(c1);
        Curso c2 = new Curso(2, "curso2", "Primero", "B");
        aListaCursos.add(c2);
        Curso c3 = new Curso(3, "curso3", "Primero", "C");
        aListaCursos.add(c3);
        Curso c4 = new Curso(4, "curso4", "Primero", "D");
        aListaCursos.add(c4);
        Curso c5 = new Curso(5, "curso5", "Segundo", "A");
        aListaCursos.add(c5);
        Curso c6 = new Curso(6, "curso6", "Segundo", "B");
        aListaCursos.add(c6);
        Curso c7 = new Curso(7, "curso7", "Segundo", "C");
        aListaCursos.add(c7);
        Curso c8 = new Curso(8, "curso8", "Segundo", "D");
        aListaCursos.add(c8);
        Curso c9 = new Curso(9, "curso9", "Tercero", "A");
        aListaCursos.add(c9);
        Curso c10 = new Curso(10, "curso10", "Tercero", "B");
        aListaCursos.add(c10);
        Curso c11 = new Curso(11, "curso11", "Tercero", "C");
        aListaCursos.add(c11);
        Curso c12 = new Curso(12, "curso12", "Tercero", "D");
        aListaCursos.add(c12);
        Curso c13 = new Curso(13, "curso13", "Cuarto", "A");
        aListaCursos.add(c13);
        Curso c14 = new Curso(14, "curso14", "Cuarto", "B");
        aListaCursos.add(c14);
        Curso c15 = new Curso(15, "curso15", "Cuarto", "C");
        aListaCursos.add(c15);
        Curso c16 = new Curso(16, "curso16", "Cuarto", "D");
        aListaCursos.add(c16);

        /*
        int idCurso;
    private String nombre;
    private String ano;
    private String letra;
         */
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
        // Llamar a la ventana del alumno antiguo
        vAlumnoAntiguo = new AlumnoAntiguo();
        vAlumnoAntiguo.setVisible(true);
    }

    public static Curso buscarCurso(String tfCursoAno, String tfCursoLetra) {
        for (Curso c : aListaCursos) {
            if (c.getAno().equalsIgnoreCase(tfCursoAno) && c.getLetra().equalsIgnoreCase(tfCursoLetra)) {
                return c;
            }
        }
        // Si llega hasta aquí es que no ha encontrado el curso
        return null;
    }
    public static void buscarDni(String tfDni){
        for(Persona p:aListaPersonas ){
            if(p.getDni().equalsIgnoreCase(tfDni))
               vAlumnoNuevo.mensajePersonaExiste();
        }
        
    }
    public static void guardarDatos(String tfdni, String tfnombre, String tfapellidos, String tfAno,String tfLetra) {
       Curso curso = buscarCurso(tfAno,tfLetra);
        Persona p1 = new Persona(tfdni, tfnombre, tfapellidos, curso);
        aListaPersonas.add(p1);
        vAlumnoNuevo.mensajeCadastro();
    }

    public static void matricularAlumnoAntiguo(String tfdni, String tfAno,String tfLetra) {
        for (Persona p : aListaPersonas) {
            if (p.getDni().equalsIgnoreCase(tfdni)) {
                vAlumnoAntiguo.mensaje();
            } else {
                vAlumnoAntiguo.mensajeNecesitaCadastrar();
                llamarVentanaAlumnoNuevo();
            }
        }
    }

    public static void buscarBorrar(String tfdni, String tfAno,String tfLetra) {
       for (Persona p : aListaPersonas) {
            if (p.getDni().equalsIgnoreCase(tfdni) && p.getcurso().getAno().equalsIgnoreCase(tfAno)
                    && p.getcurso().getLetra().equalsIgnoreCase(tfLetra)) {
                   p=null;
                vAlumnoAntiguo.mensajeBorrar();
            } else {
                vAlumnoAntiguo.mensajeNecesitaCadastrar();
                llamarVentanaAlumnoNuevo();
            }
        }
    }

    public static void volverVentanaTipo() {
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

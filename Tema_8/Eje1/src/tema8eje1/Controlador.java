/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8eje1;

import ModeloBBDD.Conexion;
import ModeloBBDD.tPersona;
import ModeloUML.Persona;
import Vista.Principal;
import Vista.Vpersona;
import java.util.ArrayList;
import static javax.swing.JOptionPane.*;

public class Controlador {

    private static Conexion objConexion;
    private static tPersona tp;

    private static Persona per;
    private static ArrayList<Persona> aListaPersonas;
    private static int posicion;

    private static Principal p;
    private static Vpersona vp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            objConexion = new Conexion();
            objConexion.conectar();

            tp = new tPersona(objConexion.getCon());

            p = new Principal();
            p.setVisible(true);

        } catch (Exception gnr) {
            objConexion.desconectar();
            System.out.println(gnr.getMessage());
        }
    }

    public static void llamarVPersona(int n) throws Exception {
        if (n == 3) {
            aListaPersonas = tp.consultarPersonas();

            if (aListaPersonas.size() > 0) {
                posicion = 0;
                vp = new Vpersona(aListaPersonas.get(0).getDni(),
                        aListaPersonas.get(0).getNombre(),
                        aListaPersonas.get(0).getEdad(),
                        aListaPersonas.get(0).getProfesion(),
                        aListaPersonas.get(0).getTelefono());
                vp.setVisible(true);

            } else {
                throw new Exception("No hay personas");
            }
        } else {
            p.setVisible(false);
        }

        vp = new Vpersona(n);
        vp.setVisible(true);

    }

    public static void llamarPrincipal() {
        vp.setVisible(false);
        p.setVisible(true);

    }

    public static void insertarPersona(String dni, String nombre, String edad, String profesion, String telefono) throws Exception {

        per = new Persona();
        per.setDni(dni);
        per.setNombre(nombre);
        per.setEdad(edad);
        per.setProfesion(profesion);
        per.setTelefono(telefono);

        tp.insertarPersona(per);
    }

    public static void consultarPersona(String dni) throws Exception {
        Persona p1 = tp.consultarPersona(dni);
        ver(p1);
    }

    public static void ver(Persona p1) {
        showMessageDialog(null, "Dni Persona " + p1.getDni() + "\n"
                + "\n" + " Nombre Persona " + p1.getNombre()
                + "\n" + " Edad Persona " + p1.getEdad()
                + "\n" + " Profesión Persona " + p1.getProfesion()
                + "\n" + " Teléfono Persona " + p1.getTelefono());

    }

    public static String siguinteDni() throws Exception {
        posicion = posicion + 1;
        return aListaPersonas.get(posicion).getDni();
    }

    public static String siguinteNombre() throws Exception {

        return aListaPersonas.get(posicion).getNombre();
    }

    public static String siguinteEdad() throws Exception {

        return aListaPersonas.get(posicion).getEdad();
    }

    public static String siguinteProfesion() throws Exception {

        return aListaPersonas.get(posicion).getProfesion();
    }

    public static String siguinteTelefono() throws Exception {

        return aListaPersonas.get(posicion).getTelefono();
    }

    public static boolean llamarAnterior() {
        if (posicion == 0) {
            return false;
        }
        return true;
    }

    public static boolean llamarSiguiente() {
        if (posicion == aListaPersonas.size() - 1) {
            return false;
        }
        return true;
    }

    public static ArrayList cogerDatos() {
        return aListaPersonas;
    }

    public static void salir() {
        objConexion.desconectar();
        System.exit(0);
    }
}

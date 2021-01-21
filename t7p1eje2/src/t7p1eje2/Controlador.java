/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1eje2;

import Modelos.Persona;
import Vistas.AltaPersonas;
import java.util.ArrayList;
import Vistas.ListadoPersonas;

/**
 *
 * @author ketro
 */
public class Controlador {

    private static ArrayList<Persona> listaPersonas = new ArrayList();
    private static AltaPersonas ap;
    private static ListadoPersonas lp;

    public static void main(String[] args) {
        // Crear y dejarla visible
        ap = new AltaPersonas();
        ap.setVisible(true);

        lp = new ListadoPersonas();
    }

    public static void addPersona(String nombre, String apellidos, String dni) {

        Persona p1 = new Persona(nombre, apellidos, dni);
        listaPersonas.add(p1);
    }

    public static String getDatosPersonas() {
        String mensaje = "";
        // Por cada elemento de persona que esta en la lista de personas
        for (Persona p : listaPersonas) {
            mensaje += p.getDatosPersonales() + "\n";
        }
        return mensaje;
    }

    public static void llamarListadoPersonas() {
        ap.setVisible(false);

        lp.setVisible(true);
        // String mensaje= getDatosPersonas();
        lp.mostrarDatosPersonales(getDatosPersonas());

    }

    public static void salir() {
        //ap.dispose();
        System.exit(0);
    }

}

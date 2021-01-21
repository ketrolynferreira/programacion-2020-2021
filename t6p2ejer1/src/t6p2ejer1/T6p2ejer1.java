/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t6p2ejer1;

import Clases.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author ketro
 */
public class T6p2ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Pimpom", 1990, 2.5f, "comedia");
        Pelicula p2 = new Pelicula("Pimpim", 2000, 1.8f, "drama");
        Pelicula p3 = new Pelicula("Pimpam", 2005, 2.6f, "suspense");
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        listaPeliculas.add(p1);
        listaPeliculas.add(p2);
        listaPeliculas.add(p3);

        LocalDate fecha = LocalDate.of(2020, 5, 25);
        LocalDate fecha1 = LocalDate.of(2, 12, 1980);
        LocalDate fecha2 = LocalDate.of(3, 9, 1970);
        ArrayList<Integer> aTelefonos = new ArrayList();
        aTelefonos.add(12524545);

        Estudio e1 = new Estudio("uno", "Natal", "asasas", "www.sdes", fecha, "Bolivia", aTelefonos);
        Estudio e2 = new Estudio("dos", "Pipa", "ass", "www.sdas", fecha1, "Chile", aTelefonos);
        Estudio e3 = new Estudio("tres", "Tibal", "asasa", "www.sdss", fecha2, "Peru", aTelefonos);

    }

    public static Pelicula buscarPeliculaLarga(ArrayList<Pelicula> listaPeliculas) {
        Pelicula peliculaMayor = listaPeliculas.get(0);
        
        for (Pelicula item : listaPeliculas) {
            if(item.getDuracion() > peliculaMayor.getDuracion())
                peliculaMayor = item;
            
        }
        
        return peliculaMayor;
    }
    
    public static Pelicula buscarPeliculaPorTitulo(ArrayList<Pelicula> listaPeliculas, String titulo) {
        for (Pelicula item : listaPeliculas) {
            if (item.getTitulo().equalsIgnoreCase(titulo))
                return item;
        }
        return null;
    }
    /*
    public static ArrayList<Pelicula> buscarPeliculaPorPais(ArrayList<Pelicula> listaPeliculas, String pais) {
       ArrayList<Pelicula> resultado =new ArrayList();
        for (Pelicula item : listaPeliculas) {
            if (item.getPais().equalsIgnoreCase(pais))
                resultado.add(item);
                
        }
        return resultado;
    }*/
}

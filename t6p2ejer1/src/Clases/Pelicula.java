/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author ketro
 */
public class Pelicula {
    // Atributos
    private String titulo;
    private int año;
    private float duracion;
    private String tipo;
    
    // Relacion
    ArrayList<Estudio> listaEstudio;

   
    
    // Constructores

    public Pelicula() {
    }

    public Pelicula(String titulo, int año, float duracion, String tipo) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
    }
     public Pelicula(ArrayList<Estudio> listaEstudio) {
        this.listaEstudio = listaEstudio;
    }
     
     // Gets & Sets

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(char año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Estudio> getListaEstudio() {
        return listaEstudio;
    }

    public void setListaEstudio(ArrayList<Estudio> listaEstudio) {
        this.listaEstudio = listaEstudio;
    }
     
    // Métodos
    public static void nuevaPelicula(){}
    public static void modificaPelicula(){}
    public static void despliegaPelicula(){}
    public static void eliminaPelicula(){}
    
}

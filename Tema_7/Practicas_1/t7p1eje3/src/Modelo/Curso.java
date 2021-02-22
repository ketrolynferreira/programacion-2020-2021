/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author ketro
 */
public class Curso {
    // Atributos
    private int idCurso;
    private String nombre;
    private String ano;
    private String letra;
    
    //Relación
    ArrayList<Persona> listaPersonas;
    
    // Constructores

    public Curso() {
    }

    public Curso(int idCurso, String nombre, String ano, String letra, ArrayList<Persona> listaPersonas) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.ano = ano;
        this.letra = letra;
        this.listaPersonas = listaPersonas;
    }

    public Curso(int idCurso, String nombre, String ano, String letra) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.ano = ano;
        this.letra = letra;
    }
    
    
    
    // Gets & Sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public ArrayList<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
    
    
}

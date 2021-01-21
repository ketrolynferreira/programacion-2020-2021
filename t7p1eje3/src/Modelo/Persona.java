/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ketro
 */
public class Persona {
    // Atributos 
    private String dni;
    private String nombre;
    private String apellidos;
    private int idCursos;
    // Constructores

    public Persona() {
    }

    public Persona(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Persona(String dni, String nombre, String apellidos, int idCursos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.idCursos = idCursos;
    }
    
    
    // Gets & Sets

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdCursos() {
        return idCursos;
    }

    public void setIdCursos(int idCursos) {
        this.idCursos = idCursos;
    }
    
    
}

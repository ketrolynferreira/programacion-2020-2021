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
public class Producto {

    // Atributos
    private int idProducto;
    private String nombre;
    private float precioUnitario;
    private int numeroUnidades;

    // Constructores
    public Producto() {
    }

    public Producto(int idProducto, String nombre, float precioUnitario, int numeroUnidades) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.numeroUnidades = numeroUnidades;
    }

    // Gets & Sets
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }
    
    public boolean comprobarStock(Producto p) {
        boolean falta;
        if(this.getNumeroUnidades() <= 2 || this.getNumeroUnidades() == 0)
            falta=true;
        else
            falta=false;
        return falta;
    }
}

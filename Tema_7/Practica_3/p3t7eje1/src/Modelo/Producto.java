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
public class Producto {
    private String nombre;
    private int unidade;
    private float precioUnitario;
    
    // Relacoes
    private ArrayList<Proveedor> listaProvedores;
   
    
    // Constructores

    public Producto() {
    }

    public Producto(String nombre, int unidade, float precioUnitario) {
        this.nombre = nombre;
        this.unidade = unidade;
        this.precioUnitario = precioUnitario;
    }

    public Producto(String nombre, int unidade, float precioUnitario, ArrayList<Proveedor> listaProvedores) {
        this.nombre = nombre;
        this.unidade = unidade;
        this.precioUnitario = precioUnitario;
        this.listaProvedores = listaProvedores;
    }
    
    // Gets & Sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public ArrayList<Proveedor> getListaProvedores() {
        return listaProvedores;
    }

    public void setListaProvedores(ArrayList<Proveedor> listaProvedores) {
        this.listaProvedores = listaProvedores;
    }
    
}

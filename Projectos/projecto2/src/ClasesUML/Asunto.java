/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesUML;

/**
 *
 * @author ketro
 */
public class Asunto {
    private int numeroArchivo;
    private String fechaI;
    private String fechaF;
    private String estado;
    private Cliente idCliente;

    public Asunto() {
    }

    public Asunto(int numeroArchivo, String fechaI, String fechaF, String estado, Cliente idCliente) {
        this.numeroArchivo = numeroArchivo;
        this.fechaI = fechaI;
        this.fechaF = fechaF;
        this.estado = estado;
        this.idCliente = idCliente;
    }

    public int getNumeroArchivo() {
        return numeroArchivo;
    }

    public void setNumeroArchivo(int numeroArchivo) {
        this.numeroArchivo = numeroArchivo;
    }

    public String getFechaI() {
        return fechaI;
    }

    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }

    public String getFechaF() {
        return fechaF;
    }

    public void setFechaF(String fechaF) {
        this.fechaF = fechaF;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }
    
    
}

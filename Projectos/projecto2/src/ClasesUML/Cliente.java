package ClasesUML;

import java.util.ArrayList;

/**
 *
 * @author ketro
 */
public class Cliente {
    private int idCliente;
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Asunto> aListaAsuntos;
    
    public Cliente() {
    }

    public Cliente(int idCliente, String dni, String nombre, String direccion, String telefono) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Cliente(int idCliente, String dni, String nombre, String direccion, String telefono, ArrayList<Asunto> aListaAsuntos) {
        this.idCliente = idCliente;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.aListaAsuntos = aListaAsuntos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Asunto> getaListaAsuntos() {
        return aListaAsuntos;
    }

    public void setaListaAsuntos(ArrayList<Asunto> aListaAsuntos) {
        aListaAsuntos=new ArrayList();
        this.aListaAsuntos = aListaAsuntos;
    }

  
    
    
}

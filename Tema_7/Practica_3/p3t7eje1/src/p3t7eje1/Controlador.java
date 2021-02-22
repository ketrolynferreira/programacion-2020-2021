/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3t7eje1;

import Modelo.Producto;
import Modelo.Proveedor;
import Vista.Almacen;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;

/**
 *
 * @author ketro
 */
public class Controlador {

    private static Producto prd;
    private static ArrayList<Producto> aListaProductos;
    private static ArrayList<Proveedor> aListaProveedores;
    private static Almacen vAlmacen;

    public static void main(String[] args) {
        crearProveedores();
        crearProductos();

        vAlmacen = new Almacen();
        vAlmacen.setVisible(true);

    }

    public static void crearProveedores() {
        // Creando el ArrayList General de todos los Proveedores
        aListaProveedores = new ArrayList();

        //Añadiendo todos los Proveedores
        aListaProveedores.add(new Proveedor("Cooperativa agraria 1"));
        aListaProveedores.add(new Proveedor("Cooperativa agraria 2"));
        aListaProveedores.add(new Proveedor("Cooperativa avicola"));
        aListaProveedores.add(new Proveedor("Cooperativa carnica 1"));
        aListaProveedores.add(new Proveedor("Cooperativa carnica 2"));

    }

    public static void crearProductos() {
        // Creamos un Array de proveedor para cada producto
        ArrayList<Proveedor> aProvCereales = new ArrayList();

        Proveedor prov1 = new Proveedor("Cooperativa agraria 1");
        aProvCereales.add(prov1);

        Proveedor prov2 = new Proveedor("Cooperativa agraria 2");
        aProvCereales.add(prov2);

        // Creamos un Producto con un ArrayList de provedores
        Producto p1 = new Producto("Avena", 10, 1.5f, aProvCereales);

        ArrayList<Proveedor> aProvPollo = new ArrayList();
        aProvPollo.add(new Proveedor("Cooperativa avicola"));

        Producto p2 = new Producto("Pollo", 10, 3.5f, aProvPollo);

        ArrayList<Proveedor> aProvCarne = new ArrayList();

        Proveedor provCarne1 = new Proveedor("Cooperativa carnica 1");
        aProvCarne.add(provCarne1);

        Proveedor provCarne2 = new Proveedor("Cooperativa carnica 2");
        aProvCarne.add(provCarne2);

        Producto p3 = new Producto("Jamón Serrano", 10, 5.43f, aProvCarne);

        // Creamos y Añadimos los productos al Arraylist productos
        aListaProductos = new ArrayList();
        aListaProductos.add(p1);
        aListaProductos.add(p2);
        aListaProductos.add(p3);

    }

    public static Producto buscarProducto(String tfnombreP) {
        for (Producto p : aListaProductos) {
            if (p.getNombre().equalsIgnoreCase(tfnombreP)) {
                prd = p;
                return prd;
            }
        }
        return null;
    }

    public static float mostrarprecioUnitarioCompra(String tfProducto) {
        float precioU;
        if (prd.getNombre().equalsIgnoreCase(tfProducto)) {
            precioU = prd.getPrecioUnitario();
            return precioU;
        } else {
            return 0;
        }
    }

    public static void llenarProvedor(JComboBox cbProveedor) {
        for (Proveedor p : aListaProveedores) {
            cbProveedor.addItem(p.getNombre());
        }
    }

    public static float mostrarImporteProductos(String tfUnidades, String tfprecioU) {
        int unidades = Integer.parseInt(tfUnidades);
        float precioUnitario = Float.parseFloat(tfprecioU);
        float importe = unidades * precioUnitario;
        return importe;
    }

    public static int anadirUnidadesAlStock(String tfUnidades) {
        if (!tfUnidades.isEmpty()) {
            int unidades = Integer.parseInt(tfUnidades);
            int unidadesTotal;
            unidadesTotal = prd.getUnidade() + unidades;
            prd.setUnidade(unidadesTotal);
            return unidadesTotal;
        } else {
            return 0;
        }
    }


    public static void mostrarCompra(JPanel pCompra) {
        pCompra.setVisible(true);
    }

    public static float llamarPrecioVenta(String uVenta) {
        if (!uVenta.isEmpty()) {
            int unidadesVenta = Integer.parseInt(uVenta);
            float precioFinalUnitario;
            precioFinalUnitario = (prd.getPrecioUnitario() * 2) * unidadesVenta;
            return precioFinalUnitario;
        } else {
            return 0;
        }
    }

    public static void guardarCliente(String tfCliente) {
        String cliente = tfCliente;
    }

    public static float descuento(JCheckBox cbVolumen, String precioVenta, String tfUnidades, JCheckBox cbProntoP) {
        float precioV;
        float descuento = 0;
        float importe;
        precioV = Float.parseFloat(precioVenta);
        
        if (cbVolumen.isSelected() && cbProntoP.isSelected()) {
            descuento = precioV * 0.05f;
        } else if (cbVolumen.isSelected()) {
            descuento = precioV * 0.02f;
        } else if (cbProntoP.isSelected()) {
            descuento = precioV * 0.03f;
        }
        
        importe = precioV - descuento;
        return importe;
    }

    public static int restarUnidadesAlStock(String tfUnidades) {
        if (!tfUnidades.isEmpty()) {
            int unidades = Integer.parseInt(tfUnidades);
            int unidadesTotal;
            unidadesTotal = prd.getUnidade() - unidades;
            prd.setUnidade(unidadesTotal);
            return unidadesTotal;
        } else {
            return 0;
        }
    }

    public static void salir() {
        vAlmacen.dispose();
        System.exit(0);
    }
}

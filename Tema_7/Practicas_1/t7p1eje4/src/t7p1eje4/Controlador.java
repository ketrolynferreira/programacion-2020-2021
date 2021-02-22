/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t7p1eje4;

import Modelo.Producto;
import Vista.Compra;
import Vista.Principal;
import Vista.Venta;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author ketro
 */
public class Controlador {

    private static ArrayList<Producto> aListaProductos;
    private static Principal vPrincipal;
    private static Venta vVenta;
    private static Compra vCompra;
    private static Producto p;

    public static void main(String[] args) {
        crearProductos();

        // Crear Ventana
        vPrincipal = new Principal();
        vPrincipal.setVisible(true);

    }

    public static void crearProductos() {
        // Crear ArrayList<Producto> 
        aListaProductos = new ArrayList();
        // Crear Producto
        Producto p1 = new Producto(01, "Leche", 1.50f, 10);
        // Add Producto al ArrayList
        aListaProductos.add(p1);
        Producto p2 = new Producto(02, "Huevo", 0.50f, 10);
        aListaProductos.add(p2);
        Producto p3 = new Producto(03, "Pollo", 2.50f, 10);
        aListaProductos.add(p3);
        Producto p4 = new Producto(04, "Papel Higienico", 3.50f, 10);
        aListaProductos.add(p4);
        Producto p5 = new Producto(05, "Lechuga", 0.40f, 4);
        aListaProductos.add(p5);
    }

    public static void llamarVenta() {
        // Borrar Ventana Principal
        vPrincipal.setVisible(false);

        // Crear vVenta
        vVenta = new Venta();
        vVenta.setVisible(true);
    }

    public static void llamarCompra() {
        // Borrar Ventana Principal
        vPrincipal.setVisible(false);

        // Crear vCompra
        vCompra = new Compra();
        vCompra.setVisible(true);
    }

    public static void volverPrincipal(JFrame v) {
        // Borrar Ventana Principal
        v.setVisible(false);

        // Llamar vPrincipal
        vPrincipal.setVisible(true);
    }

    public static void llenarCbProductos(JComboBox cbProductos) {

        for (Producto pr : aListaProductos) {
            cbProductos.addItem(pr.getNombre());
        }
    }

    public static Producto buscarProducto(String tfNombre) {

        for (Producto pr : aListaProductos) {
            if (pr.getNombre().equalsIgnoreCase(tfNombre)) {
                p = pr;
                return p;
            }
        }
        return null;

    }

    public static boolean comprobarUnidades(String tfUnidades) {
        int unidades = Integer.parseInt(tfUnidades);
        if (p.getNumeroUnidades() >= unidades) {
            return true;
        } else {
            return false;
        }
    }

    public static float calcularImporte(String tfunidades) {
        int unidades = Integer.parseInt(tfunidades);

        float importe = p.getPrecioUnitario() * unidades;

        return importe;
    }

    public static void actualizarUnidades(String tfUnidades) {
        int unidadesVendidas = Integer.parseInt(tfUnidades);
        int resultadoUnidades = p.getNumeroUnidades() - unidadesVendidas;
        p.setNumeroUnidades(resultadoUnidades);
    }

    public static void validarCuantidadEnTienda(String tfUnidades) {
        int unidades = Integer.parseInt(tfUnidades);
        for (Producto p : aListaProductos) {
            if (p.getNumeroUnidades() < unidades) {
                vVenta.mensajeVentaNoValida();
            }
        }
    }

    public static String verPrecioDelProducto(String cbProducto) {

        return String.valueOf(p.getPrecioUnitario());

    }
    public static void AtualizarUnidadesProducto( String tfUnidades){
    int unidades= Integer.parseInt(tfUnidades);
    int unidadesActualizadas = p.getNumeroUnidades()+unidades;
    p.setNumeroUnidades(unidadesActualizadas);
    }

    public static void salir() {
        // Borrar Ventana Principal
        vPrincipal.dispose();
        // Salir
        System.exit(0);
    }
}

/*
 * Nuestro primer ejercicio consistira en hacer un juego 
 * de adivinar la suma de dos numeros generados aleatoriamente
 */
package t7p1ejer1;

import Vistas.Ventana1;

/**
 *
 * @author 1gdaw10
 */
public class Controlador {

    private static Ventana1 v1;
    private static int contadorIntentos = 0;
    private static int contadorAciertos = 0;
    private static int contadorFallas = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear ventana y mostrar
        v1 = new Ventana1();
        v1.setVisible(true);
    }

    // Generar los dos numeros
    public static int generarNumero() {
        int n = (int) (Math.random() * 999) + 1;
        return n;
    }

    // Comprobar El resultado del usuario 
    public static void ComprobarNumero(String n3, String n1, String n2) {
        int nro1 = Integer.parseInt(n1);
        int nro2 = Integer.parseInt(n2);
        int nro3 = Integer.parseInt(n3);
            
            contadorIntentos++;
        int suma = nro1 + nro2;
        
        if (nro3 == suma) {
            
            contadorAciertos++;
        }else{
            contadorFallas++;
        }
    }

    public static void salir() {
        v1.dispose();
        System.exit(0);
    }

}

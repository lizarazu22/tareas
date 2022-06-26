package Practica3.Ejercicio2Bridge;

public class PagoEfectivo implements ITipoPago{

    @Override
    public void pagar(double precio) {
        System.out.println("***** SE PAGARA EN EFECTIVO *****");
        System.out.println("El costo será de: " + precio);
        System.out.println("INFO -> Sin descuento");
        System.out.println();
    }
}

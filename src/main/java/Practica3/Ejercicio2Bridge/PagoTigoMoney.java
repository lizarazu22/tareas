package Practica3.Ejercicio2Bridge;

import java.text.DecimalFormat;

public class PagoTigoMoney implements ITipoPago{

    DecimalFormat formato= new DecimalFormat("#.00");

    @Override
    public void pagar(double precio) {
        System.out.println("***** SE PAGARA POR TIGO MONEY *****");
        System.out.println("El costo será de: " + formato.format(precio-(precio*0.02)));
        System.out.println("INFO -> Descuento del 2%");
        System.out.println();
    }
}

package Practica3.Ejercicio2Bridge;

import java.text.DecimalFormat;

public class PagoTransferenciaBancaria implements ITipoPago{

    DecimalFormat formato= new DecimalFormat("#.00");

    @Override
    public void pagar(double precio) {
        System.out.println("***** SE PAGARA POR TRANSFERENCIA BANCARIA *****");
        System.out.println("El costo será de: " + formato.format(precio-(precio*0.05)));
        System.out.println("INFO -> Descuento del 5%");
        System.out.println();
    }
}

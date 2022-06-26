package Practica3.Ejercicio2Bridge;

import java.text.DecimalFormat;

public class PagoAplicacionEmpresa implements ITipoPago{

    DecimalFormat formato= new DecimalFormat("#.00");

    @Override
    public void pagar(double precio) {
        System.out.println("***** SE PAGARA POR LA APLICACION DE LA EMPRESA *****");
        System.out.println("El costo será de: " + formato.format(precio-(precio*0.10)));
        System.out.println("INFO -> Descuento del 10%");
        System.out.println();
    }
}

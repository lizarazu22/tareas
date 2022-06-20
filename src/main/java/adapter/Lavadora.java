package adapter;

import java.text.DecimalFormat;

public class Lavadora implements IArtefactosElectronicosPequeno{
    private boolean factura;
    private double costo;
    private String marca;
    DecimalFormat formato= new DecimalFormat("#.00");

    public Lavadora(boolean factura, double costo, String marca){
        this.costo=costo;
        this.marca=marca;
        this.factura=factura;
    }

    public boolean isFactura() {
        return factura;
    }

    public void setFactura(boolean factura) {
        this.factura = factura;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public DecimalFormat getFormato() {
        return formato;
    }

    public void setFormato(DecimalFormat formato) {
        this.formato = formato;
    }

    @Override
    public void costo() {
        if(factura){
            System.out.println("El costo con factura es de: "+costo);
            System.out.println();
        }else{
            System.out.println("El costo sin factura es de: "+formato.format(costo+(costo*0.16)));
            System.out.println();
        }
    }

    @Override
    public void tiempoDeGarantia() {
        if(marca.equals("SAMSUNG")){
            System.out.println("Garantia de 20 años SAMSUNG");
            System.out.println();
        }else{
            System.out.println("Garantia de 10 años "+marca);
            System.out.println();
        }
    }
}

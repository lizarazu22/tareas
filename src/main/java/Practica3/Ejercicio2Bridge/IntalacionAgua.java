package Practica3.Ejercicio2Bridge;

public class IntalacionAgua implements IEmpresas{
    private ITipoPago tipoPago;
    private double precio;
    private String nombre;
    private int nit;
    private int numAutorizacion;

    public IntalacionAgua(ITipoPago tipoPago, String nombre, int nit, int numAutorizacion, double precio){
        this.tipoPago=tipoPago;
        this.nombre=nombre;
        this.nit=nit;
        this.numAutorizacion=numAutorizacion;
        this.precio=precio;
    }

    @Override
    public void tipoPago() {
        System.out.println("--- ANALIZANDO TIPO DE PAGO ---");
        showInfo();
        System.out.println();
        tipoPago.pagar(precio);
        System.out.println();
    }

    public void showInfo(){
        System.out.println("Nombre de la empresa: "+nombre);
        System.out.println("NIT: "+nit);
        System.out.println("Numero de autorizacion: "+numAutorizacion);
        System.out.println("Precio normal: "+precio);
    }
}

package decorator;

import java.util.Random;

public class Promocion implements IBanco{
    boolean ganador;
    Random rd = new Random();
    IBanco banco;

    public Promocion(IBanco banco) {
        this.banco = banco;
        int numeroAleatorio = rd.nextInt(100)+1;
        ganador= numeroAleatorio % 2==0;
    }

    @Override
    public int monto() {
        return banco.monto();
    }

    @Override
    public String nombrePropietario() {

        return banco.nombrePropietario();
    }

    @Override
    public void agregarFondos(int cantidad) {
        banco.agregarFondos(cantidad);

    }

    @Override
    public void quitarFondos(int cantidad) {
        banco.quitarFondos(cantidad);

    }

    @Override
    public void informacionCuenta() {
        banco.informacionCuenta();
        if(ganador) {
            System.out.println("GANASTE LA PROMOCION");
            banco.agregarFondos(banco.monto());
            System.out.println("Nuevo monto en cuenta: "+ banco.monto());
        }else {
            System.out.println("No ganaste la promocion");
        }
    }
}

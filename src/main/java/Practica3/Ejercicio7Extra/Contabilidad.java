package Practica3.Ejercicio7Extra;

public class Contabilidad extends Duenos {

    public Contabilidad() {}

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("NOTIFY -> CONTABILIDAD");
        System.out.println("\t Mensaje: "+ mensaje);
    }
}

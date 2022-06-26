package Practica3.Ejercicio7Extra;

public class Presidente extends Duenos{

    public Presidente() {}

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("NOTIFY -> PRESIDENTE");
        System.out.println("\t Mensaje: "+ mensaje);
    }
}

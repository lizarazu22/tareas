package Practica3.Ejercicio7Extra;

public class Vicepresidente extends Duenos{

    public Vicepresidente() {}

    @Override
    public void messageReceived(String mensaje) {
        System.out.println("NOTIFY -> VICEPRESIDENTE");
        System.out.println("\t Mensaje: "+ mensaje);
    }
}

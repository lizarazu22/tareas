package Practica3.Ejercicio7Extra;

public class Laptop implements IComputadora{
    private int tamano;
    private int precio;

    public Laptop(int tamano) {
        this.tamano = tamano;
        this.precio = 100;
    }

    @Override
    public void shofInfo() {
        System.out.println("----- LAPTOP -----");
        System.out.println("Materiales: ");
        System.out.println("\t Cinta electrica liquida");
        System.out.println("\t Pinzas de presion");
        System.out.println("\t Detector de voltaje");
    }

    @Override
    public int kitReparacion(IVisitor visitor) {
        return visitor.reparar(this);
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

package Practica3.Ejercicio7Extra;

public class Tablet implements IComputadora{
    private int tamano;
    private int precio;

    public Tablet(int tamano) {
        this.tamano = tamano;
        this.precio = 70;
    }

    @Override
    public void shofInfo() {
        System.out.println("----- TABLET -----");
        System.out.println("Materiales: ");
        System.out.println("\t Silicona");
        System.out.println("\t Pinzas");
        System.out.println("\t Destornillador");
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

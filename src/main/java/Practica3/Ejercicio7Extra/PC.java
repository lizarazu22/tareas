package Practica3.Ejercicio7Extra;

public class PC implements IComputadora{
    private int tamano;
    private int precio;

    public PC(int tamano) {
        this.tamano = tamano;
        this.precio = 150;
    }

    @Override
    public void shofInfo() {
        System.out.println("----- PC -----");
        System.out.println("Materiales: ");
        System.out.println("\t Pulsera antiestatica");
        System.out.println("\t Multimetro");
        System.out.println("\t Camara termica");
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

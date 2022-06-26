package Practica3.Ejercicio6Visitor;

public class Televisor implements IArtefactosElectronicos{
    private String marca;
    private String tamano;
    private String resolucion;
    private int garantia;
    private boolean controlInteligente;

    public Televisor(String marca, String tamano, String resolucion, int garantia, boolean controlInteligente) {
        this.marca = marca;
        this.tamano = tamano;
        this.resolucion = resolucion;
        this.garantia = garantia;
        this.controlInteligente = controlInteligente;
    }

    @Override
    public void showInfo() {
        System.out.println("------- TELEVISOR -------");
    }

    @Override
    public void mantener(IVisitor visitor) {
        visitor.mantenimiento(this);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public boolean isControlInteligente() {
        return controlInteligente;
    }

    public void setControlInteligente(boolean controlInteligente) {
        this.controlInteligente = controlInteligente;
    }
}

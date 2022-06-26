package Practica3.Ejercicio6Visitor;

public class Celular implements IArtefactosElectronicos{
    private String marca;
    private String modelo;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void showInfo() {
        System.out.println("------- CELULAR -------");
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

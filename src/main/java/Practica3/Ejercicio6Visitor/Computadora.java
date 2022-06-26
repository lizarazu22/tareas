package Practica3.Ejercicio6Visitor;

public class Computadora implements IArtefactosElectronicos{
    @Override
    public void showInfo() {
        System.out.println("------- COMPUTADORA -------");
    }

    @Override
    public void mantener(IVisitor visitor) {
        visitor.mantenimiento(this);
    }

}

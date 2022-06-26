package Practica3.Ejercicio6Visitor;

public interface IArtefactosElectronicos {
    void showInfo();
    void mantener(IVisitor visitor);
}

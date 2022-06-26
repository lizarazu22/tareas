package Practica3.Ejercicio7Extra;

public interface IVisitor {
    int reparar(Laptop laptop);
    int reparar(PC pc);
    int reparar(Tablet tablet);
}

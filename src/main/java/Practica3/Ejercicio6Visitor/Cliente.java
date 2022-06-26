package Practica3.Ejercicio6Visitor;

public class Cliente {
    public static void main(String[] args){
        Celular celular = new Celular("Apple", "Iphone 12 PLUS");
        Computadora computadora = new Computadora();
        Televisor televisor = new Televisor("SONY", "47 pulgadas", "1920 x 1080 pixeles", 10, true);

        ConcreteVisitor concreteVisitor= new ConcreteVisitor();
        celular.mantener(concreteVisitor);
        computadora.mantener(concreteVisitor);
        televisor.mantener(concreteVisitor);
    }
}

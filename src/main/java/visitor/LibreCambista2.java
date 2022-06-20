package visitor;

import java.text.DecimalFormat;

public class LibreCambista2 implements IVisitor{
    DecimalFormat formato= new DecimalFormat("#.00");

    @Override
    public void changeBolivia(Bolivia bolivia) {
        System.out.println("Cambiando de Bolivianos a Dolares: ");
        System.out.println("Monto a cambiar: "+bolivia.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(bolivia.getAmount()*0.14));
        System.out.println();
    }

    @Override
    public void changeArgentina(Argentina argentina) {
        System.out.println("Cambiando de Pesos Argentinos a Dolares: ");
        System.out.println("Monto a cambiar: "+argentina.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(argentina.getAmount()*0.010));
        System.out.println();
    }

    @Override
    public void changeBrasil(Brasil brasil) {
        System.out.println("Cambiando de Reales a Dolares: ");
        System.out.println("Monto a cambiar: "+brasil.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(brasil.getAmount()*0.20));
        System.out.println();
    }

    @Override
    public void changeItalia(Italia italia) {
        System.out.println("Cambiando de Euros a Dolares: ");
        System.out.println("Monto a cambiar: "+italia.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(italia.getAmount()*1.19));
        System.out.println();
    }
}

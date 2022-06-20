package visitor;

import java.text.DecimalFormat;

public class LibreCambista1 implements IVisitor{
    DecimalFormat formato= new DecimalFormat("#.00");

    @Override
    public void changeBolivia(Bolivia bolivia) {
        System.out.println("Cambiando de Dolares a Bolivianos: ");
        System.out.println("Monto a cambiar: "+bolivia.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(bolivia.getAmount()*6.96));
        System.out.println();
    }

    @Override
    public void changeArgentina(Argentina argentina) {
        System.out.println("Cambiando de Dolares a Peso Argentino: ");
        System.out.println("Monto a cambiar: "+argentina.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(argentina.getAmount()*95.40));
        System.out.println();
    }

    @Override
    public void changeBrasil(Brasil brasil) {
        System.out.println("Cambiando de Dolares a Reales: ");
        System.out.println("Monto a cambiar: "+brasil.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(brasil.getAmount()*5.09));
        System.out.println();
    }

    @Override
    public void changeItalia(Italia italia) {
        System.out.println("Cambiando de Dolares a Euros: ");
        System.out.println("Monto a cambiar: "+italia.getAmount());
        System.out.println("Monto a cambiado: "+formato.format(italia.getAmount()*0.84));
        System.out.println();
    }
}

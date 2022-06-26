package Practica3.Ejercicio6Visitor;

import java.util.Random;

public class ConcreteVisitor implements IVisitor {
    @Override
    public void mantenimiento(Celular celular) {
        celular.showInfo();
        System.out.println("Marca: "+celular.getMarca());
        System.out.println("Modelo: "+celular.getModelo());
        System.out.println("Mantenimiento: PREVENTIVO");
        System.out.println();
    }

    @Override
    public void mantenimiento(Computadora computadora) {
        computadora.showInfo();
        Random random = new Random();
        int numRandom= random.nextInt(100)+1;
        if(numRandom%2==0){
            System.out.println("Mantenimiento: PREVENTIVO");
        }else{
            System.out.println("Mantenimiento: CORRECTIVO");
        }
        System.out.println();
    }

    @Override
    public void mantenimiento(Televisor televisor) {
        televisor.showInfo();
        System.out.println("Marca: "+televisor.getMarca());
        System.out.println("Tamaño: "+televisor.getTamano());
        System.out.println("Resolucion: "+televisor.getResolucion());
        System.out.println("Garantia: "+televisor.getGarantia());
        System.out.println("Control inteligente: "+televisor.isControlInteligente());
        System.out.println();
    }
}

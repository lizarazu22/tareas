package Practica3.Ejercicio7Extra;

public class Cliente {
    public static void main(String[] args){
        // SERVIVIO TECNICO
        Laptop laptop = new Laptop(16);
        PC pc = new PC(30);
        Tablet tablet = new Tablet(17);

        ConcreteVisitor concreteVisitor= new ConcreteVisitor();
        laptop.kitReparacion(concreteVisitor);
        pc.kitReparacion(concreteVisitor);
        tablet.kitReparacion(concreteVisitor);

        System.out.println();
        System.out.println("****************************************************************************************");
        System.out.println();

        //NOTIFICACIONES DE LA CUENTA UNICA
        Duenos presidente = new Presidente();
        Duenos vicepresidente = new Vicepresidente();
        Duenos contador = new Contabilidad();

        CuentaSingleton cuenta = CuentaSingleton.getInstance();

        cuenta.addDueno(presidente);
        cuenta.addDueno(vicepresidente);
        cuenta.addDueno(contador);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new PC(16)));
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Tablet(30)));

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                cuenta.pagar(cuenta.repararComputador(new Laptop(17)));

            }
        });

        thread1.run();
        System.out.println();
        thread2.run();
        System.out.println();
        thread3.run();
    }
}

package Practica3.Ejercicio7Extra;

import java.util.LinkedList;
import java.util.List;

public class CuentaSingleton {
    int monto;
    static List<Duenos> dueno;

    public static CuentaSingleton instance = null;

    private CuentaSingleton() {
        dueno = new LinkedList<Duenos>();
        monto = 0;
    }

    public synchronized static void addDueno(Duenos nuevoDueno) {
        dueno.add(nuevoDueno);
    }

    private synchronized static void makeInstace() {
        if (instance == null)
            instance = new CuentaSingleton();
    }

    public static CuentaSingleton getInstance() {
        if (instance == null)
            makeInstace();
        return instance;
    }

    public synchronized int repararComputador(IComputadora computadora) {
        ConcreteVisitor concreteVisitor = new ConcreteVisitor();
        int precio = computadora.kitReparacion(concreteVisitor);
        System.out.println("~~~~~~ RECIBO ~~~~~~");
        System.out.println("Se cobrarán: "+ precio);
        return precio;

    }

    public synchronized void pagar(int monto) {
        this.monto += monto;
        NotificarTransaccion notificarTransaccion = new NotificarTransaccion();
        for (Duenos d : dueno) {
            notificarTransaccion.addDueno(d);
        }
        notificarTransaccion.enviar("Se ha recibido el monto de " + monto);
    }
}

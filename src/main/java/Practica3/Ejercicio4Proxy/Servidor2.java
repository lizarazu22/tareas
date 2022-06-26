package Practica3.Ejercicio4Proxy;

public class Servidor2 implements ICluster{

    @Override
    public void brindarAtencion(int usuario, String password) {
        System.out.println("----- SERVIDOR 2 -----");
        System.out.println("Se esta atendiendo al usuario:");
    }
}

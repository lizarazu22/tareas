package Practica3.Ejercicio4Proxy;

public class Cliente {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new Servidor1(), new Servidor2());


        proxy.register(1,"Jose", "Pepe", "123");
        proxy.register(2,"Juan", "Juanqui", "abc");
        proxy.register(3,"Vanesa", "Vane", "456");
        proxy.register(4,"Rebeca", "Rebe", "def");
        proxy.register(5,"Sofia", "Sofi", "789");

        proxy.brindarAtencion(1, "123");
        proxy.brindarAtencion(2, "abc");
        proxy.brindarAtencion(3, "456");
        proxy.brindarAtencion(4, "def");
        proxy.brindarAtencion(5, "789");
        proxy.brindarAtencion(1, "000");
        proxy.brindarAtencion(7, "123");
    }
}

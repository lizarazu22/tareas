package proxy;

public class Cliente {
    public static void main (String[]args){
        Proxy verificacion = new Proxy();

        verificacion.sacarDinero(new Cuenta(1003562712,"Juan","BOLIVIANOS", 300.00, 20));

        verificacion.sacarDinero(new Cuenta(2004566737,"Pedro","DOLARES", 550.00, 30));

        verificacion.sacarDinero(new Cuenta(1887563536,"Jose","EUROS", 50.00, 50));
    }
}

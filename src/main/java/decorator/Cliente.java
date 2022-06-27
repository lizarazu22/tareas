package decorator;

public class Cliente {
    public static void main(String[] args) {
        IBanco banco = new CuentaDeBanco("jose", 1000);
        banco.informacionCuenta();

        banco = new BancaPorInternet(banco, true);
        banco.informacionCuenta();

        banco = new Seguro(10, banco);
        banco.informacionCuenta();

        banco = new Promocion(banco);
        banco.informacionCuenta();

    }

}

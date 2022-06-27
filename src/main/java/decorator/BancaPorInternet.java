package decorator;

public class BancaPorInternet implements IBanco{
    boolean enable;
    IBanco banco;

    public BancaPorInternet(IBanco banco, boolean enable) {
        this.banco = banco;
        this.enable = enable;
    }

    @Override
    public int monto() {
        return banco.monto();
    }

    @Override
    public String nombrePropietario() {

        return banco.nombrePropietario();
    }
    @Override
    public void agregarFondos(int cantidad) {
        banco.agregarFondos(cantidad);

    }

    @Override
    public void quitarFondos(int cantidad) {
        banco.quitarFondos(cantidad);

    }

    @Override
    public void informacionCuenta() {
        banco.informacionCuenta();
        System.out.println("Tarjeta habilitada para banca por internet: " + enable);

    }
}

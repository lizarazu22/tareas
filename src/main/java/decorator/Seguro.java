package decorator;

public class Seguro implements IBanco{
    int precio;
    IBanco banco;

    public Seguro(int precio, IBanco banco) {
        this.precio = precio;
        this.banco = banco;
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
        banco.quitarFondos(precio);
        System.out.println("Seguro de la cuenta habilitado, monto disponible actual: " + banco.monto());
    }
}

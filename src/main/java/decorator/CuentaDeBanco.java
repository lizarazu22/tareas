package decorator;

public class CuentaDeBanco implements IBanco {
    String nombrePropietario;
    int monto;

    public CuentaDeBanco(String nombrePropietario, int monto) {
        this.nombrePropietario = nombrePropietario;
        this.monto = monto;
    }

    @Override
    public int monto() {
        return monto;
    }
    @Override
    public String nombrePropietario() {
        return nombrePropietario;
    }
    @Override
    public void agregarFondos(int cantidad) {
        monto+=cantidad;

    }
    @Override
    public void quitarFondos(int cantidad) {
        monto-=cantidad;

    }
    @Override
    public void informacionCuenta() {
        System.out.println("INFORMACION CUENTA DE BANCO");
        System.out.println("Nombre: "+nombrePropietario);
        System.out.println("Monto: "+ monto);
        System.out.println();
    }
}

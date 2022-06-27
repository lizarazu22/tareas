package decorator;

public interface IBanco {
    public int monto();
    public void agregarFondos(int cantidad);
    public void quitarFondos(int cantidad);
    public String nombrePropietario();
    public void informacionCuenta();
}

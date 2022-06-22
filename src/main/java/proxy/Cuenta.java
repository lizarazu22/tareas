package proxy;

public class Cuenta {
    private int numeroDeCuenta;
    private String nombre;
    private String tipoDeMoneda;
    private double ahorros;
    private double costoCompra;

    public Cuenta( int numeroDeCuenta, String nombre, String tipoDeMoneda, double ahorros, double costoCompra){
        this.numeroDeCuenta= numeroDeCuenta;
        this.nombre=nombre;
        this.tipoDeMoneda=tipoDeMoneda;
        this.ahorros=ahorros;
        this.costoCompra=costoCompra;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeMoneda() {
        return tipoDeMoneda;
    }

    public void setTipoDeMoneda(String tipoDeMoneda) {
        this.tipoDeMoneda = tipoDeMoneda;
    }

    public double getAhorros() {
        return ahorros;
    }

    public void setAhorros(double ahorros) {
        this.ahorros = ahorros;
    }

    public double getCostoCompra() {
        return costoCompra;
    }

    public void setCostoCompra(double costoCompra) {
        this.costoCompra = costoCompra;
    }

    public void showInfo(){
        System.out.println("Numero de cuenta: "+ numeroDeCuenta);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Tipo de menda: "+ tipoDeMoneda);
        System.out.println("Dinero ahorrado: "+ ahorros);
        System.out.println("Costo de la compra: "+ costoCompra);
    }
}

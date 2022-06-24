package composite;

public abstract class EquipoElectronico {
    private String marca;
    private String procesador;
    private String nombreGrupo;
    private int precio=100;

    public EquipoElectronico(String nombre){
        this.nombreGrupo=nombre;
    }
    public EquipoElectronico(String marca, String procesador) {
        this.marca = marca;
        this.procesador = procesador;
    }

    public void info(){
        System.out.println("Procesador: "+procesador);
        System.out.println("Marca: "+marca);
        System.out.println("Precio: "+precio+ " $");
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public abstract void operation();
    public abstract void add(EquipoElectronico component);
    public abstract void remove(EquipoElectronico component);
    public abstract void getChild(int position);
}

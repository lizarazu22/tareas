package Practica3.Ejercicio5Adapter;

public class Escritorio implements IAplicacionesComputadora{
    private String name;
    private String type;

    public Escritorio(String name, String type){
        this.name=name;
        this.type=type;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("***** ESCRITORIO *****");
        System.out.println("INFO -> Iniciando sesion Escritorio");
        shoInfo();
    }

    @Override
    public void cerrarSesion() {
        System.out.println("***** ESCRITORIO *****");
        System.out.println("INFO -> Cerran sesion Escritorio");
        shoInfo();
    }

    @Override
    public void generacionDatos() {
        System.out.println("***** ESCRITORIO *****");
        System.out.println("INFO -> Generando datos Escritorio");
        shoInfo();
    }

    public void shoInfo(){
        System.out.println("Nombre de la aplicaion: "+name);
        System.out.println("Tipo de aplicaion "+type);
        System.out.println();
    }
}

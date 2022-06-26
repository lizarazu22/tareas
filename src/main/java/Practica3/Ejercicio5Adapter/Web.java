package Practica3.Ejercicio5Adapter;

public class Web implements IAplicacionesComputadora{
    private String name;
    private String type;

    public Web(String name, String type){
        this.name=name;
        this.type=type;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("***** WEB *****");
        System.out.println("INFO -> Iniciando sesion WEB");
        shoInfo();
    }

    @Override
    public void cerrarSesion() {
        System.out.println("***** WEB *****");
        System.out.println("INFO -> Cerran sesion WEB");
        shoInfo();
    }

    @Override
    public void generacionDatos() {
        System.out.println("***** WEB *****");
        System.out.println("INFO -> Generando datos WEB");
        shoInfo();
    }

    public void shoInfo(){
        System.out.println("Nombre de la aplicaion: "+name);
        System.out.println("Tipo de aplicaion "+type);
        System.out.println();
    }
}

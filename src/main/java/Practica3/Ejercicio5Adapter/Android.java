package Practica3.Ejercicio5Adapter;

public class Android implements IAplicacionesMoviles{
    private String name;
    private String type;

    public Android(String name, String type){
        this.name=name;
        this.type=type;
    }

    @Override
    public void login() {
        System.out.println("***** ANDROID *****");
        System.out.println("LOGIN -> Android");
        shoInfo();
    }

    @Override
    public void logout() {
        System.out.println("***** ANDROID *****");
        System.out.println("LOGOUT -> Android");
        shoInfo();
    }

    @Override
    public void report() {
        System.out.println("***** ANDROID *****");
        System.out.println("REPORT -> Android");
        shoInfo();
    }

    public void shoInfo(){
        System.out.println("Nombre de la aplicaion: "+name);
        System.out.println("Tipo de aplicaion "+type);
        System.out.println();
    }
}

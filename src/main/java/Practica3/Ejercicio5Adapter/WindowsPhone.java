package Practica3.Ejercicio5Adapter;

public class WindowsPhone implements IAplicacionesMoviles{
    private String name;
    private String type;

    public WindowsPhone(String name, String type){
        this.name=name;
        this.type=type;
    }

    @Override
    public void login() {
        System.out.println("***** WINDOWS PHONE *****");
        System.out.println("LOGIN -> Windows Phone");
        shoInfo();
    }

    @Override
    public void logout() {
        System.out.println("***** WINDOWS PHONE *****");
        System.out.println("LOGOUT -> Windows Phone");
        shoInfo();
    }

    @Override
    public void report() {
        System.out.println("***** WINDOWS PHONE *****");
        System.out.println("REPORT -> Windows Phone");
        shoInfo();
    }

    public void shoInfo(){
        System.out.println("Nombre de la aplicaion: "+name);
        System.out.println("Tipo de aplicaion "+type);
        System.out.println();
    }
}

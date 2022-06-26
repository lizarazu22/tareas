package Practica3.Ejercicio5Adapter;

public class IOS implements IAplicacionesMoviles{
    private String name;
    private String type;

    public IOS(String name, String type){
        this.name=name;
        this.type=type;
    }

    @Override
    public void login() {
        System.out.println("***** IOS *****");
        System.out.println("LOGIN -> IOS");
        shoInfo();
    }

    @Override
    public void logout() {
        System.out.println("***** IOS *****");
        System.out.println("LOGOUT -> IOS");
        shoInfo();
    }

    @Override
    public void report() {
        System.out.println("***** IOS *****");
        System.out.println("REPORT -> IOS");
        shoInfo();
    }

    public void shoInfo(){
        System.out.println("Nombre de la aplicaion: "+name);
        System.out.println("Tipo de aplicaion "+type);
        System.out.println();
    }
}

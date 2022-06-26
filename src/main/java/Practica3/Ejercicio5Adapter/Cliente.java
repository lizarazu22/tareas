package Practica3.Ejercicio5Adapter;

public class Cliente {
    public static void main(String[]args){
        // Aplicaciones para computadora
        Web web = new Web("DOTA", "juego" );
        Escritorio escritorio = new Escritorio("IntelliJ IDEA", "IDE");

        web.iniciarSesion();
        escritorio.cerrarSesion();

        // Aplicaciones moviles
        Android android = new Android("Call of Duty", "juego");
        IOS ios = new IOS("Chess", "juego");
        WindowsPhone windowsPhone = new WindowsPhone("Solitario","juego");

        android.login();
        ios.logout();
        windowsPhone.report();

        //Adaptando
        AplicacionesComputadorAdaptado aplicacionesComputadorAdaptado = new AplicacionesComputadorAdaptado(web, escritorio);
        aplicacionesComputadorAdaptado.login();
        aplicacionesComputadorAdaptado.logout();
        aplicacionesComputadorAdaptado.report();
    }
}

package Practica3.Ejercicio5Adapter;

public class AplicacionesComputadorAdaptado implements IAplicacionesMoviles{
    private Web web;
    private Escritorio escritorio;

    public AplicacionesComputadorAdaptado(Web web, Escritorio escritorio){
        System.out.println("------- ADAPTANDO APLICACIONES DE COMPUTADORA A APLICACIONES MOVILES -------");
        this.web=web;
        this.escritorio=escritorio;
    }
    @Override
    public void login() {
        web.iniciarSesion();
        escritorio.iniciarSesion();
    }

    @Override
    public void logout() {
        web.cerrarSesion();
        escritorio.cerrarSesion();
    }

    @Override
    public void report() {
        web.generacionDatos();
        escritorio.generacionDatos();
    }
}

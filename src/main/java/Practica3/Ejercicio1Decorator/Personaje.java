package Practica3.Ejercicio1Decorator;

public class Personaje implements IWarcraft{
    private String nombre;
    private int nivel;
    private String armas;
    private int porcentajeArmadura;
    private int puntosAtaque;
    private int puntosDefensa;
    private int puntosRegeneracion;

    public Personaje(String nombre){
        this.nombre=nombre;
        this.nivel=1;
        this.armas="Todavia no tienes una arma";
        this.porcentajeArmadura=1;
        this.puntosAtaque=1;
        this.puntosDefensa =1;
        this.puntosRegeneracion=1;
    }


    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public void darNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public int nivel() {
        return nivel;
    }

    @Override
    public void subirNivel(int niveles) {
        nivel=nivel+niveles;
    }

    @Override
    public String armas() {
        return armas;
    }

    @Override
    public void darArmas(String arma) {
        this.armas=arma;
    }

    @Override
    public int porcentajeArmadura() {
        return porcentajeArmadura;
    }

    @Override
    public void aumentarPorcentajeArmadura(int porcentaje) {
        porcentajeArmadura=porcentajeArmadura+porcentaje;
    }

    @Override
    public int puntosAtaque() {
        return puntosAtaque;
    }

    @Override
    public void aumentarPuntosAtaque(int puntos) {
        puntosAtaque=puntosAtaque+puntos;
    }

    @Override
    public int puntosDefensa() {
        return puntosDefensa;
    }

    @Override
    public void aumentarPuntosDefensa(int puntos) {
        puntosDefensa = puntosDefensa +puntos;
    }

    @Override
    public int puntosRegeneracion() {
        return puntosRegeneracion;
    }

    @Override
    public void aumentarPuntosRegeneracion(int puntos) {
        puntosRegeneracion=puntosRegeneracion+puntos;
    }

    @Override
    public void showInfo() {
        System.out.println("Personaje");
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Armas: " + armas);
        System.out.println("Porcentaje de armadura: " + porcentajeArmadura);
        System.out.println("Puntos defensa: " + puntosDefensa);
        System.out.println("Puntos ataque: " + puntosAtaque);
        System.out.println("Puntos regeneracion: " + puntosRegeneracion);
        System.out.println();
    }
}

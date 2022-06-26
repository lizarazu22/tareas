package Practica3.Ejercicio1Decorator;

public class AgregarPersonaje implements IWarcraft{
    private IWarcraft warcraft;
    private String armas;

    public AgregarPersonaje(IWarcraft warcraft, String armas) {
        this.warcraft = warcraft;
        this.darArmas(armas);
    }

    @Override
    public String nombre() {
        return warcraft.nombre();
    }

    @Override
    public void darNombre(String nombre) {
        warcraft.darNombre(nombre);
    }

    @Override
    public int nivel() {
        return warcraft.nivel();
    }

    @Override
    public void subirNivel(int niveles) {
        warcraft.subirNivel(niveles);
    }

    @Override
    public String armas() {
        return warcraft.armas();
    }

    @Override
    public void darArmas(String arma) {
        warcraft.darArmas(arma);
        warcraft.aumentarPuntosAtaque(30);
        warcraft.subirNivel(warcraft.nivel()*2);
    }

    @Override
    public int porcentajeArmadura() {
        return warcraft.porcentajeArmadura();
    }

    @Override
    public void aumentarPorcentajeArmadura(int porcentaje) {
        warcraft.aumentarPorcentajeArmadura(porcentaje);
    }

    @Override
    public int puntosAtaque() {
        return warcraft.puntosAtaque();
    }

    @Override
    public void aumentarPuntosAtaque(int puntos) {
        warcraft.aumentarPuntosAtaque(puntos);
    }

    @Override
    public int puntosDefensa() {
        return warcraft.puntosDefensa();
    }

    @Override
    public void aumentarPuntosDefensa(int puntos) {
        warcraft.aumentarPuntosDefensa(puntos);
    }

    @Override
    public int puntosRegeneracion() {
        return warcraft.puntosRegeneracion();
    }

    @Override
    public void aumentarPuntosRegeneracion(int puntos) {
        warcraft.aumentarPuntosRegeneracion(puntos);
    }

    @Override
    public void showInfo() {
        System.out.println("----- SE AGREGO UN PERSONAJE -----");
        warcraft.showInfo();
    }
}

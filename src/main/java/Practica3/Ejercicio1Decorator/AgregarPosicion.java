package Practica3.Ejercicio1Decorator;

public class AgregarPosicion implements IWarcraft{
    private IWarcraft warcraft;

    public AgregarPosicion(IWarcraft warcraft) {
        this.warcraft = warcraft;
        this.aumentarPuntosRegeneracion(80);
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
        warcraft.subirNivel(warcraft.nivel());
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
        System.out.println("----- SE AGREGO UNA POSICION -----");
        warcraft.showInfo();
    }
}

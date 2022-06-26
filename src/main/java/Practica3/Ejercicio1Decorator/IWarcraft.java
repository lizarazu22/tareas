package Practica3.Ejercicio1Decorator;

public interface IWarcraft {
    String nombre();
    void darNombre(String nombre);
    int nivel();
    void subirNivel(int niveles);
    String armas();
    void darArmas(String arma);
    int porcentajeArmadura();
    void aumentarPorcentajeArmadura(int porcentaje);
    int puntosAtaque();
    void aumentarPuntosAtaque(int puntos);
    int puntosDefensa();
    void aumentarPuntosDefensa(int puntos);
    int puntosRegeneracion();
    void aumentarPuntosRegeneracion(int puntos);
    void showInfo();
}

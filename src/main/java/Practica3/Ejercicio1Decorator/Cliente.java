package Practica3.Ejercicio1Decorator;

public class Cliente {
    public static void main(String[] args) {
        IWarcraft warcraft = new Personaje("personaje 1");
        warcraft.showInfo();

        warcraft = new AgregarPersonaje(warcraft, "ESPADA");
        warcraft.showInfo();

        warcraft = new AgregarEscudo(warcraft);
        warcraft.showInfo();

        warcraft = new AgregarPosicion(warcraft);
        warcraft.showInfo();
    }
}

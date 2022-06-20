package adapter;

public class Cliente {
    public static void main(String[]args){
        // Empresa Pequeña
        Televisor televisor = new Televisor(true, 1000, "SAMSUNG");
        Lavadora lavadora = new Lavadora(false, 3000, "X");
        Refrigerador refrigerador = new Refrigerador(true, 1500, "CHINA");

        // Empresa Grande
        Celular celular = new Celular("APPLE", 9);
        Tablet tablet = new Tablet("HUAWEI", 7);
        Computadora computadora = new Computadora("XIAOMI",3);

        celular.precio();
        celular.tiempoDeVida();

        tablet.precio();
        tablet.tiempoDeVida();

        computadora.precio();
        computadora.tiempoDeVida();

        //Adaptando
        ArtefactoPequenoAdaptado artefactoPequenoAdaptado = new ArtefactoPequenoAdaptado(televisor, lavadora, refrigerador);
        artefactoPequenoAdaptado.precio();
        artefactoPequenoAdaptado.tiempoDeVida();
    }
}

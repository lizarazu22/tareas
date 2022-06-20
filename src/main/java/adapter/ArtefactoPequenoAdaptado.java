package adapter;

public class ArtefactoPequenoAdaptado implements IArtefactosElectronicosGrande{
    private Televisor televisor;
    private Lavadora lavadora;
    private Refrigerador refrigerador;

    public ArtefactoPequenoAdaptado(Televisor televisor, Lavadora lavadora, Refrigerador refrigerador){
        System.out.println("******************************************************************");
        System.out.println("Adaptando artefactos electronicos de la tienda pequeña a la grande");
        System.out.println();
        this.lavadora=lavadora;
        this.refrigerador=refrigerador;
        this.televisor=televisor;
    }

    @Override
    public void precio() {
        this.televisor.costo();
        this.lavadora.costo();
        this.refrigerador.costo();
    }

    @Override
    public void tiempoDeVida() {
        this.televisor.tiempoDeGarantia();
        this.refrigerador.tiempoDeGarantia();
        this.lavadora.tiempoDeGarantia();
    }
}

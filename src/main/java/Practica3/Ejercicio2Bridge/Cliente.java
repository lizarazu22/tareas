package Practica3.Ejercicio2Bridge;

public class Cliente {
    public static void main(String[] args){

        IEmpresas empresaAlcantarillado = new InstalacionAlcantarillado(new PagoEfectivo(), "EPSAS", 1245343, 10000234, 140);
        empresaAlcantarillado.tipoPago();

        IEmpresas empresaAlcantarillado2 = new InstalacionAlcantarillado(new PagoAplicacionEmpresa(), "SEMAPA", 233243, 10002345, 200);
        empresaAlcantarillado2.tipoPago();

        IEmpresas empresaElectrica = new InstalacionElectrica(new PagoTigoMoney(), "De la Paz", 5433123, 20000434, 170);
        empresaElectrica.tipoPago();

        IEmpresas empresaElectrica2 = new InstalacionElectrica(new PagoTransferenciaBancaria(), "SEPSA", 346544, 10043222, 100);
        empresaElectrica2.tipoPago();

        IEmpresas empresaAgua = new IntalacionAgua(new PagoAplicacionEmpresa(), "SAGUAPAC", 543326, 10002788, 150);
        empresaAgua.tipoPago();

        IEmpresas empresaAgua2 = new IntalacionAgua(new PagoTigoMoney(), "COOSALT", 123422, 2003737, 300);
        empresaAgua2.tipoPago();
    }
}

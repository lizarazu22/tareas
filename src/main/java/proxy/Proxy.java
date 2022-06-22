package proxy;

public class Proxy implements IBanco{
    private TarjetaDeDebito tarjetaDeDebito = new TarjetaDeDebito();

    @Override
    public void sacarDinero(Cuenta cuenta) {
        if(cuenta.getTipoDeMoneda().equals("BOLIVIANOS")){
            tarjetaDeDebito.sacarDinero(cuenta);
        }else if(cuenta.getTipoDeMoneda().equals("DOLARES")){
            cuenta.setCostoCompra(cuenta.getCostoCompra()*6.96);
            cuenta.setTipoDeMoneda("BOLIVIANOS");
            tarjetaDeDebito.sacarDinero(cuenta);
        }else if(cuenta.getTipoDeMoneda().equals("EUROS")){
            cuenta.setCostoCompra(cuenta.getCostoCompra()*8.23);
            cuenta.setTipoDeMoneda("BOLIVIANOS");
            tarjetaDeDebito.sacarDinero(cuenta);
        }else if(cuenta.getTipoDeMoneda().equals("PESOS MEXICANOS")){
            cuenta.setCostoCompra(cuenta.getCostoCompra()*0.34);
            cuenta.setTipoDeMoneda("BOLIVIANOS");
            tarjetaDeDebito.sacarDinero(cuenta);
        }else if(cuenta.getTipoDeMoneda().equals("REALES")){
            cuenta.setCostoCompra(cuenta.getCostoCompra()*1.39);
            cuenta.setTipoDeMoneda("BOLIVIANOS");
            tarjetaDeDebito.sacarDinero(cuenta);
        }else if(cuenta.getTipoDeMoneda().equals("SOLES")){
            cuenta.setCostoCompra(cuenta.getCostoCompra()*1.74);
            cuenta.setTipoDeMoneda("BOLIVIANOS");
            tarjetaDeDebito.sacarDinero(cuenta);
        }
    }
}

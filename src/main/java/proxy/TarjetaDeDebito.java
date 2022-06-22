package proxy;

public class TarjetaDeDebito implements IBanco{
    @Override
    public void sacarDinero(Cuenta cuenta) {
        if(cuenta.getAhorros() >= cuenta.getCostoCompra()){
            System.out.println("---------- TRANSACCION ------------");
            System.out.println("Se esta retirando el monto de: "+ cuenta.getCostoCompra());
            System.out.println("Su saldo actual es de: "+(cuenta.getAhorros()-cuenta.getCostoCompra()));
            System.out.println("INFORMACION DE LA CUENTA");
            cuenta.showInfo();
            System.out.println("-----------------------------------");
        }else{
            System.out.println("SALDO INSUFICIENTE");
            cuenta.showInfo();
            System.out.println();
        }
    }
}

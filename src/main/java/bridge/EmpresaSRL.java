package bridge;

public class EmpresaSRL implements  Empresas{
    private EnviodePaquete enviodePaquete;

    public EmpresaSRL(EnviodePaquete enviodePaquete){
        this.enviodePaquete=enviodePaquete;
    }

    @Override
    public void tipoDeEnvio() {
        System.out.println("Se esta buscando el tipo de envío...");
        enviodePaquete.enviarpaqute();
    }
}

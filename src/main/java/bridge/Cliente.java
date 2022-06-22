package bridge;

public class Cliente {
    public static void main(String[] args){

        Empresas empresaSRL = new EmpresaSRL(new Aire("NESTLE", 10));
        empresaSRL.tipoDeEnvio();

        Empresas empresaSRL2 = new EmpresaSRL(new Tierra("ARCOR", 20));
        empresaSRL2.tipoDeEnvio();

        Empresas empresaSRL3 = new EmpresaSRL(new Mar("OSFIN", 30));
        empresaSRL3.tipoDeEnvio();

        Empresas empresaSA = new EmpresaSA(new Aire("PIL", 40));
        empresaSA.tipoDeEnvio();

        Empresas empresaSA2 = new EmpresaSA(new Tierra("DELICIA", 50));
        empresaSA2.tipoDeEnvio();

        Empresas empresaSA3 = new EmpresaSA(new Mar("ENTEL", 60));
        empresaSA3.tipoDeEnvio();
    }
}

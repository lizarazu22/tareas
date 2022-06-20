package visitor;

public class Cliente {
    public static void main(String []sss){
        Bolivia bolivia= new Bolivia();
        bolivia.setAmount(100);

        Argentina argentina= new Argentina();
        argentina.setAmount(200);

        Brasil brasil= new Brasil();
        brasil.setAmount(300);

        Italia italia = new Italia();
        italia.setAmount(400);

        LibreCambista1 libreCambista1 = new LibreCambista1();
        // Cambiando a la moneda extrangera
        bolivia.change(libreCambista1);
        argentina.change(libreCambista1);
        brasil.change(libreCambista1);
        italia.change(libreCambista1);

        LibreCambista2 libreCambista2 = new LibreCambista2();
        // Cambiando a dolares
        bolivia.change(libreCambista2);
        argentina.change(libreCambista2);
        brasil.change(libreCambista2);
        italia.change(libreCambista2);
    }
}

package adapter;

public class Tablet implements IArtefactosElectronicosGrande{
    private String marca;
    private int modelo;

    public Tablet(String marca, int modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    @Override
    public void precio() {
        showInfo();
        if(marca.equals("APPLE")){
            System.out.println("Precio esta por encima de los 1000 $");
            System.out.println();
        }else if(marca.equals("SAMSUNG")){
            System.out.println("Precio esta por encima de los 700 $ y por debajo de los 1000 $");
            System.out.println();
        }else if(marca.equals("HUAWEI")){
            System.out.println("Precio esta por encima de los 500 $ y por debajo de los 700 $");
            System.out.println();
        }else {
            System.out.println("Precio esta por debajo de los 300$ ");
            System.out.println();
        }
    }

    @Override
    public void tiempoDeVida() {
        showInfo();
        if(modelo>=10){
            System.out.println("Tiempo de vida es mayor a los 7 años");
            System.out.println();
        }else if(modelo>=7 && modelo<10){
            System.out.println("Tiempo de vida es mayor a los 5 años pero menor a los 7 años");
            System.out.println();
        }else if(modelo>=5 && modelo<7){
            System.out.println("Tiempo de vida es mayor a los 3 años pero menor a los 5 años");
            System.out.println();
        }else{
            System.out.println("Tiempo de vida es menor a los 3 años ");
            System.out.println();
        }
    }

    public void showInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}

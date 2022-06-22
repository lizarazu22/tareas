package bridge;

import java.text.DecimalFormat;

public class Aire implements EnviodePaquete{
    private String name;
    private double price;
    DecimalFormat formato= new DecimalFormat("#.00");

    public Aire(String name, int price){
        this.name=name;
        this.price=price;
    }

    @Override
    public void enviarpaqute() {
        System.out.println("Se hara el envio por aire");
        System.out.println("El costo será de: " + formato.format(getPrice()+(getPrice()*0.10)));
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

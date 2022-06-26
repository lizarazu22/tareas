package Practica3.Ejercicio7Extra;

public class ConcreteVisitor implements IVisitor{
    @Override
    public int reparar(Laptop laptop) {
        laptop.shofInfo();
        if (laptop.getTamano()>=1 && laptop.getTamano()<=10){
            System.out.println("Precio: "+ laptop.getPrecio()*2);
            return laptop.getPrecio()*2;
        }else{
            System.out.println("Precio: "+ laptop.getPrecio()*3);
            return laptop.getPrecio()*3;
        }
    }

    @Override
    public int reparar(PC pc) {
        pc.shofInfo();
        if (pc.getTamano()>=1 && pc.getTamano()<=10){
            System.out.println("Precio: "+ pc.getPrecio()*2);
             return pc.getPrecio()*2;
        }else if (pc.getTamano()>=11 && pc.getTamano()<=40){
            System.out.println("Precio: "+ pc.getPrecio()*3);
            return pc.getPrecio()*3;
        }else{
            System.out.println("Precio: "+pc.getPrecio()*4);
            return pc.getPrecio()*4;
        }
    }

    @Override
    public int reparar(Tablet tablet) {
        tablet.shofInfo();
        if (tablet.getTamano()>=1 && tablet.getTamano()<=20){
            System.out.println("Precio: "+ tablet.getPrecio()*2);
            return tablet.getPrecio()*2;
        }else{
            System.out.println("Precio: "+ tablet.getPrecio()*3);
            return tablet.getPrecio()*3;
        }
    }
}

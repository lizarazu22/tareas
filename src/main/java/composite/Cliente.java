package composite;

public class Cliente {
    public static void main(String[]args){
        Basico computadora1= new Basico("Asus", "Kore i3");
        Basico computadora2= new Basico("Asus", "Kore i3");
        Basico computadora3= new Basico("Asus", "Kore i3");


        Basico computadora4= new Basico("Dell", "Kore i3");
        Basico computadora5= new Basico("Dell", "Kore i5");
        Basico computadora6= new Basico("Dell", "Kore i5");


        Basico computadora7= new Basico("HP", "Kore i7");
        Basico computadora8= new Basico("HP", "Kore i7");
        Basico computadora9= new Basico("HP", "Kore i7");


        CompositeEquipo laboratorio= new CompositeEquipo("Laboratorio 1");
        laboratorio.add(computadora1);
        laboratorio.add(computadora2);
        laboratorio.add(computadora3);

        CompositeEquipo laboratorio2= new CompositeEquipo("Laboratorio 2");
        laboratorio2.add(computadora4);
        laboratorio2.add(computadora5);
        laboratorio2.add(computadora6);

        CompositeEquipo laboratorio3=new CompositeEquipo("Laboratorio 3");
        laboratorio3.add(computadora7);
        laboratorio3.add(computadora8);
        laboratorio3.add(computadora9);

        CompositeEquipo contenedor1= new CompositeEquipo("Contenedor de computadoras 1");
        contenedor1.add(laboratorio);
        contenedor1.add(laboratorio2);
        contenedor1.add(laboratorio3);

        contenedor1.operation();
        contenedor1.showTotal();
    }
}

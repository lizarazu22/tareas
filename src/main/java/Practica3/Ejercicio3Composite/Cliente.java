package Practica3.Ejercicio3Composite;

public class Cliente {
    public static void main(String []args){
        Composite folder = new Composite();
        folder.add(new BasicArchivo("Este es el texto 1"));
        folder.add(new BasicArchivo("numero de palabras"));
        folder.add(new BasicArchivo("esta es una palabra"));


        Composite folder2 = new Composite();
        folder2.add(new BasicArchivo("Texto 2"));
        folder2.add(new BasicArchivo("folder 2 y son dos palabras"));
        folder2.add(new BasicArchivo("hola que tal como estas"));

        Composite folder3 = new Composite();
        folder3.add(new BasicArchivo("texto 3 si si"));
        folder3.add(new BasicArchivo("esta es una prueba 1 2 3"));
        folder3.add(new BasicArchivo("NUMERO NUMERO NUMERO NUMERO"));


        Composite disco = new Composite();
        disco.add(folder);
        disco.add(folder2);
        disco.add(folder3);

        disco.print();
    }
}

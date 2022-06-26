package Practica3.Ejercicio3Composite;

public class BasicArchivo extends ComponentDisco {

    public BasicArchivo(String text){
        super(text);
    }

    @Override
    public void print(){
        System.out.println("\t Nombre : "+this.getName());
        System.out.println("\t Texto: " +getText());
        System.out.println("\t Numero de palabras: " + this.getNumWords());
        System.out.println();
    }

    @Override
    public void add(ComponentDisco component) {
        System.out.println("INFO -> Not applicable on Archivo");
    }

    @Override
    public void remove(ComponentDisco component) {
        System.out.println("INFO -> Not applicable on Archivo");
    }

    @Override
    public void getChild(int position) {
        System.out.println(this.getNumWords()+" "+this.getName());
    }
}

package Practica3.Ejercicio3Composite;

import java.util.ArrayList;

public class Composite extends ComponentDisco {

    private ArrayList<ComponentDisco> componentDiscoArrayList = new ArrayList<>();

    public Composite(String text){
        super(text);
    }

    public Composite(){}

    @Override
    public void print() {
        System.out.println("Nombre: "+getName());
        System.out.println(" Numero de palabras: "+ getNumWords());
        for (ComponentDisco componentDisco: componentDiscoArrayList){
            componentDisco.print();
        }
        System.out.println("---------------");
    }

    @Override
    public void add(ComponentDisco component) {
        componentDiscoArrayList.add(component);
        this.setNumWords(getNumWords()+component.getNumWords());
        if((componentDiscoArrayList.size()>2) && (component.getName().equals("Archivo"))){
            setName("Folders");
        }
        else if((componentDiscoArrayList.size()>1) && (component.getName().equals("Folders"))){
            setName("Unidad de disco");
        }
    }

    @Override
    public void remove(ComponentDisco component) {
        componentDiscoArrayList.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(componentDiscoArrayList.get(position).getNumWords()+" "+componentDiscoArrayList.get(position).getName());
    }
}

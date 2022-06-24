package composite;

public class Basico extends EquipoElectronico{

    public Basico(String marca, String procesador) {
        super(marca, procesador);
    }

    @Override
    public void operation() {
        System.out.println("Computadora: ");
        this.info();
        System.out.println();
    }

    @Override
    public void add(EquipoElectronico component) {
        System.out.println("EXCEPTION");
    }

    @Override
    public void remove(EquipoElectronico component) {
        System.out.println("EXCEPTION");
    }

    @Override
    public void getChild(int position) {
        System.out.println("EXCEPTION");
    }
}

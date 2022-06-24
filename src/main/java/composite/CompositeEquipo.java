package composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEquipo extends EquipoElectronico {

    private List<EquipoElectronico> equipoElectronicoList = new ArrayList<>();
    private Global global;

    public CompositeEquipo (String nombregrupo){
        super(nombregrupo);
    }

    public void showTotal(){
        System.out.println("Precio total: "+global.getTotalE()+" $");
    }

    @Override
    public void operation() {
        for (EquipoElectronico artefactosElectronicos : equipoElectronicoList){
            if (artefactosElectronicos.equals(equipoElectronicoList.get(0)) && !(artefactosElectronicos instanceof Basico)) {
                global.setTotalE(0);
            }
            artefactosElectronicos.operation();
            if (artefactosElectronicos instanceof Basico)
                global.setTotalE(global.getTotalE()+artefactosElectronicos.getPrecio());
        }
    }

    @Override
    public void add(EquipoElectronico component) {
        equipoElectronicoList.add(component);
    }

    @Override
    public void remove(EquipoElectronico component) {
        equipoElectronicoList.remove(component);
    }

    @Override
    public void getChild(int position) {
        equipoElectronicoList.get(position);
    }
}
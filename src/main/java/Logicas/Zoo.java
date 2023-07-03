package Logicas;

import ElemnPanel.PanelZoo;

import java.util.ArrayList;

/**
 * clase zoo, la cual es capaz de almacenar habitats con animales dentro
 */
public class Zoo {
    /**
     * propiedad que guarda una lista de habitats dentro del zoo
     */
    private ArrayList<Habitat> h;
    /**
     * propiedad que guarda el panel en el que se representa al zoo
     */
    private PanelZoo panz;

    public Zoo(PanelZoo xd) {
        panz = xd;
        h = new ArrayList<>();
    }

    /**
     * metodo que se utiliza para añadir un habitat al zoo
     * @param a el habitat que se desea añadir
     * @throws LimiteDeHabitatException se lanza cuando se intenta añadir un habitat despues de haber añadido 6, el maximo.
     */
    public void addHab(Habitat a) throws LimiteDeHabitatException {
        if(h.size()<6){
          h.add(a);
          panz.repaint();
        }else{
            throw new LimiteDeHabitatException("Limite de Habitats alcanzado");
        }

    }

    /**
     * metodo que se utiliza para eliminar habitats del zoo.
     * @param a el indice que indica la ubicacion del habitat que se desea eliminar dentro del arraylist de habitats dentro del zoo
     */
    public void remHab(int a) {
        h.remove(a);
        panz.repaint();
        panz.revalidate();
    }

    /**
     * metodo para añadir animales a algun habitat del zoo
     * @param a representa el animal que se desea añadir
     * @param b representa el indice que indica a cual habitat del arraylist de habitats se va a añadir el animal
     * @throws AnimalIncompatibleConHabitatException se lanza cuando el animal que se desea añadir es incompatible con el habitat
     * @throws AnimalIncompatibleConLosDemasException se lanza cuando el animal que se desea añadir es incompatible con los que ya estan en el habitat
     * @throws HabitatLLenoException se lanza cuando se desea añadir un animal a un habitat lleno
     */
    public void AddAn(Animal a, int b) throws AnimalIncompatibleConHabitatException, AnimalIncompatibleConLosDemasException, HabitatLLenoException {
        h.get(b).addAnimal(a);
        panz.repaint();
    }


    /**
     * metodo para obtener la referencia al habitat en la posicion "i" del arraylist de habitats del zoo
     * @param i indice que indica que referencia a habitat del arraylist se desea obtener
     * @return retorna el habitat indicado con el parametro
     */
    public Habitat getHab(int i) {
        return h.get(i);
    }

    /**
     * metodo para obtener el numero de habitats dentro del zoo
     * @return el tamaño del arraylist de habitats del zoo
     */
    public int getNumH(){return h.size();}

}

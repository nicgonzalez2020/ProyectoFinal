package Logicas;

import java.util.ArrayList;

/**
 * Clase habitat, se utiliza para guardar los animales del zoo
 */
public class Habitat {
    /**
     * propiedad arraylist que es utilizada para guardar los animales
     */
    public ArrayList<Animal> var;
    /**
     * propiedad tipo que se utiliza para definir el tipo de habitat creado en el constructor
     */
    public int tipo;
    /**
     * propiedad que indica el limite de animales por habitat
     */
    public int limit=5;
    /**
     * propiedad que indica el nivel de agua en el habitat
     */
    public int nivelA=3;
    /**
     * propiedad que indica el nivel de comida en el habitat
     */
    public int nivelC=3;
    /**
     * propiedad que indica el tipo de comida que necesita el habitat
     */
    public int tipocomidaha=334;

    public Habitat(int tipo){
        var = new ArrayList<>();
        this.tipo = tipo;
    }

    /**
     * Metodo utilizado para añadir animales al Habitat
     * @param a es el animal que se desea agregar
     * @throws AnimalIncompatibleConHabitatException cuando el animal es incompatible con el habitat
     * @throws AnimalIncompatibleConLosDemasException cuando el animal es incompatible con los que ya estan en el habitat
     * @throws HabitatLLenoException cuando el habitat esta lleno
     */
    public void addAnimal(Animal a) throws AnimalIncompatibleConHabitatException, AnimalIncompatibleConLosDemasException, HabitatLLenoException {
        if(a.tipohabitat==tipo){
            if(var.isEmpty()){
                var.add(a);
                tipocomidaha=a.tipocomida;
            }else{
                if(var.size()<5){
                    if( var.get(var.size()-1).tipocomida == a.tipocomida){
                        var.add(a);
                    }else{
                        throw new AnimalIncompatibleConLosDemasException("Animal Incompatible con los demas animales de este Habitat");
                    }
                }else{
                    throw new HabitatLLenoException("Habitat esta lleno");
                }
            }
        }else{
            throw new AnimalIncompatibleConHabitatException("Animal Incompatible con el Habitat");
        }
    }

    /**
     * metodo para quitar animales del habitat
     * @param a es el animal que se desea quitar
     */
    public void QuitarAnimal(int a){ var.remove(a); }

    /**
     * metodo para obtener la lista de referencias a los animales dentro del habitat
     * @return la lista de animales dentro del habitat
     */
    public ArrayList<Animal> VerAnimales(){
        return var;
    }

}

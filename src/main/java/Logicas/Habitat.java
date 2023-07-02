package Logicas;

import java.util.ArrayList;

public class Habitat {
    public ArrayList<Animal> var;
    /**
     *
     */
    public int tipo;
    /**
     * limite de animales por habitat
     */
    public int limit=5;

    public int nivelA=3;
    public int nivelC=3;
    public int tipocomidaha=334;

    public Habitat(int tipo){
        var = new ArrayList<>();
        this.tipo = tipo;
    }
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
    public void QuitarAnimal(int a){ var.remove(a); }
    public ArrayList<Animal> VerAnimales(){
        return var;
    }

}

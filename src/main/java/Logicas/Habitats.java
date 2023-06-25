package Logicas;

import java.util.ArrayList;

public abstract class Habitats {
    ArrayList<Animales> var;
    int lim=5;
    int tem;
    int habcal=1;
    int habtem=2;
    int habfri=3;
    int carni=1;
    int herbi=2;
    int omni=3;
    public Habitats(){var = new ArrayList();}
    public boolean addAnimal(Animales a){
        var.add(a) ;
        return true;
    }

    public void QuitarAnimal(Animales a){
        var.remove(a);
    }

}

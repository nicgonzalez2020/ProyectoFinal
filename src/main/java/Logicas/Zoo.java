package Logicas;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Habitats> h;

    public Zoo() {
        h = new ArrayList<>();
    }

    public void addHab(Habitats a) {
        h.add(a);
    }

    public void remHab(Habitats a) {
        h.remove(a);
    }
    public void AddAn(Animales a, int b){
        h.get(b).addAnimal(a);
    }
    public void RemAn(Animales a, int b){
        h.get(b).QuitarAnimal(a);
    }

    public void AlimHab(int a){
        h.get(a).nivelAyC=5;
    }
    public Habitats getHab(int i) {
        return h.get(i);
    }
    public int getNumH(){return h.size();}

}

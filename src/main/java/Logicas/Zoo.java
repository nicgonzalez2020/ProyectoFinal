package Logicas;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Habitat> h;

    public Zoo() {
        h = new ArrayList<>();
    }

    public void addHab(Habitat a) {
        h.add(a);
    }

    public void remHab(Habitat a) {
        h.remove(a);
    }
    public void AddAn(Animal a, int b){
        h.get(b).addAnimal(a);
    }
    public void RemAn(Animal a, int b){
        h.get(b).QuitarAnimal(a);
    }

    public void AlimHab(int a){
        h.get(a).nivelAyC=5;
    }
    public Habitat getHab(int i) {
        return h.get(i);
    }
    public int getNumH(){return h.size();}

}

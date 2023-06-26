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

    public Habitats getHab(int i) {
        return h.get(i);
    }
    public int getNumH(){return h.size();}

}

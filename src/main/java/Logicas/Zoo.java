package Logicas;

import ElemnPanel.PanelZoo;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Habitat> h;
    private PanelZoo panz;

    public Zoo(PanelZoo xd) {
        panz = xd;
        h = new ArrayList<>();
    }

    public void addHab(Habitat a) throws LimiteDeHabitatException {
        if(h.size()<6){
          h.add(a);
          panz.repaint();
        }else{
            throw new LimiteDeHabitatException("Limite de Habitats alcanzado");
        }

    }

    public void remHab(int a) {
        h.remove(a);
        panz.repaint();
        panz.revalidate();
    }
    public void AddAn(Animal a, int b) throws AnimalIncompatibleConHabitatException, AnimalIncompatibleConLosDemasException, HabitatLLenoException {
        h.get(b).addAnimal(a);
        panz.repaint();
    }
    public void RemAn(int a, int b){
        h.get(b).QuitarAnimal(a);
        panz.repaint();
    }

    public void AlimHab(int a) throws ComidaNoDefinidaException {
        if(h.get(a).var.isEmpty()){
            throw new ComidaNoDefinidaException("Tipo de comida no definida");
        }
        if(h.get(a).tipocomidaha==a){
            h.get(a).nivelC=5;
            panz.repaint();
        }
    }
    public void DarAgHab(int a){
        h.get(a).nivelA=5;
        panz.repaint();
    }
    public Habitat getHab(int i) {
        return h.get(i);
    }
    public int getNumH(){return h.size();}

}

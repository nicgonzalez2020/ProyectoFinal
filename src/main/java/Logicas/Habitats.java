package Logicas;

import java.util.ArrayList;

public class Habitats {
    ArrayList<Animales> var;
    /**
     * pradera=1 , desertico=2, polar=3, acuario=4, pantano=5, selvatico=6, o sabana=7.
     */
    int tipo;
    /**
     * limite de animales por habitat
     */
    int limit=5;

    public Habitats(int tipo){
        var = new ArrayList();
        this.tipo = tipo;
    }
    public void addAnimal(Animales a){
        if(a.tipohabitat==tipo){
            if(var.isEmpty()){
                var.add(a);
            }else{
                if(var.size()<5){
                    if( var.get(var.size()-1).tipocomida == a.tipocomida){
                        var.add(a);
                    }else{
                   /*
                   lanzar excepcion, animal incompatible con los demas.
                    */
                    }
                }
            }
        }else{
            /*
            lanzar excepcion, animal incompatible con el habitat.
             */
        }
    }
    public void QuitarAnimal(Animales a){ var.remove(a); }

}

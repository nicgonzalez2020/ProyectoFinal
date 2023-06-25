package Logicas;

public abstract class Animales {

    int habcal=1;
    int habtem=2;
    int habfri=3;
    int carni=1;
    int herbi=2;
    int omni=3;
    protected int tipohabitat;
    protected int tipocomida;

    public Animales(){

    }
    public int getTipeF(){
        return tipocomida;
    }

    public int getTipeH(){
        return tipohabitat;
    }


}

package Logicas;

public abstract class Animal {

    int pradera=1;
    int polar=2;
    public int esp;
    int acuario=3;
    int sabana=4;
    public int tipohabitat;
    public int tipocomida;
    protected String descripcion;
    public Animal(){}
    public String getDescripcion(){
        return descripcion;
    }


}

package Logicas;

public class HabCalC extends Habitats{
    public HabCalC(){
        tem=habcal;
    }
    @Override
    public boolean addAnimal(Animales a) {
        if(a.getTipeF()==carni && a.getTipeH()==tem){
            super.addAnimal(a);
            return true;
        }else{
            return false;
        }
    }
}

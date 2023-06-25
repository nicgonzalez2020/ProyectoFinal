package Logicas;

public class HabCalH extends Habitats{
    public HabCalH(){
        tem=habcal;
    }
    @Override
    public boolean addAnimal(Animales a) {
        if((a.getTipeF()==herbi|| a.getTipeF()==omni) && a.getTipeH()==tem){
            super.addAnimal(a);
            return true;
        }else{
            return false;
        }
    }
}

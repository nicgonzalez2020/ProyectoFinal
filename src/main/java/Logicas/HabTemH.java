package Logicas;

public class HabTemH extends Habitats{
    public HabTemH(){
        tem=habtem;
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

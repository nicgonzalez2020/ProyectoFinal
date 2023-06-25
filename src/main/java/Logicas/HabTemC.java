package Logicas;

public class HabTemC extends Habitats{
    public HabTemC(){
        tem=habtem;
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

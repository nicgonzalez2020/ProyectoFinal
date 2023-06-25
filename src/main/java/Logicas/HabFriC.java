package Logicas;

public class HabFriC extends Habitats{
    public HabFriC(){
        tem=habfri;
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

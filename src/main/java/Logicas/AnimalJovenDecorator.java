package Logicas;

public class AnimalJovenDecorator extends AnimalDecorator{
    public AnimalJovenDecorator(Animal anim){
        super(anim);

    }
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+ " Joven.";
    }
}

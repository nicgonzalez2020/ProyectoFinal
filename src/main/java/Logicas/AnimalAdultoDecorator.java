package Logicas;

public class AnimalAdultoDecorator extends AnimalDecorator{
    public AnimalAdultoDecorator(Animal anim){
        super(anim);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion()+ " adulto/a.";
    }
}

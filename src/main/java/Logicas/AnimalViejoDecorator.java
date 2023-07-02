package Logicas;

public class AnimalViejoDecorator extends AnimalDecorator{
    public AnimalViejoDecorator(Animal anim){
        super(anim);

    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion()+ " viejo/a.";
    }
}

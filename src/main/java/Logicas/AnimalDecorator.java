package Logicas;

public abstract class AnimalDecorator extends Animal{
    protected Animal animal;
    public AnimalDecorator(Animal anim){
        animal = anim;
    }
    @Override
    public String getDescripcion() {
        return animal.getDescripcion();
    }
}

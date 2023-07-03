package Logicas;


/**
 * Clase molde del decorador de la clase animal
 */
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

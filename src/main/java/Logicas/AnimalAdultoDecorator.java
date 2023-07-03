package Logicas;

/**
 * Clase decoradora concreta para crear animales adultos
 */
public class AnimalAdultoDecorator extends AnimalDecorator{
    public AnimalAdultoDecorator(Animal anim){
        super(anim);
    }

    /**
     * metodo que retorna la descripcion del animal decorada
     * @return
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+ " adulto/a.";
    }
}

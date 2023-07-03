package Logicas;
/**
 * Clase decoradora concreta para crear animales jovenes
 */
public class AnimalJovenDecorator extends AnimalDecorator{
    public AnimalJovenDecorator(Animal anim){
        super(anim);

    }
    /**
     * metodo que retorna la descripcion del animal decorada
     * @return
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+ " Joven.";
    }
}

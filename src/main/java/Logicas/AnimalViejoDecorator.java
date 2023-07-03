package Logicas;
/**
 * Clase decoradora concreta para crear animales viejos
 */
public class AnimalViejoDecorator extends AnimalDecorator{
    public AnimalViejoDecorator(Animal anim){
        super(anim);

    }
    /**
     * metodo que retorna la descripcion del animal decorada
     * @return
     */
    @Override
    public String getDescripcion() {
        return super.getDescripcion()+ " viejo/a.";
    }
}

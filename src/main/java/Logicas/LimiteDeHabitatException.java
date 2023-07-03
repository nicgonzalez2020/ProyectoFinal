package Logicas;

/**
 * clase que se utiliza cuando se desea añadir mas habitats del maximo permitido al zoo
 */
public class LimiteDeHabitatException extends Exception{
    public LimiteDeHabitatException(String errorMessage) {
        super(errorMessage);
    }
}

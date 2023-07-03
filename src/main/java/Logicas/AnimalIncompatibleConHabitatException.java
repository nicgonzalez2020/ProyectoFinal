package Logicas;

/**
 * Clase exception para cuando un animal es incompatible con el habitat
 * en el que se le quiere ubicar
 */
public class AnimalIncompatibleConHabitatException extends Exception{
    public AnimalIncompatibleConHabitatException(String errorMessage){super(errorMessage);}
}

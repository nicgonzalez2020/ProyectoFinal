package Logicas;
/**
 * Clase exception para cuando un animal es incompatible con los demas animales del habitat
 * en el que se le quiere ubicar
 */
public class AnimalIncompatibleConLosDemasException extends Exception{
    public AnimalIncompatibleConLosDemasException(String errorMessage){super(errorMessage);}
}

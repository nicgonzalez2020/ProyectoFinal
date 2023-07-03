package Logicas;

/**
 * Exception utilizada cuando se desea añadir un animal a un habitat lleno
 */
public class HabitatLLenoException extends Exception{
    public HabitatLLenoException(String errorMessage){
        super(errorMessage);
    }
}

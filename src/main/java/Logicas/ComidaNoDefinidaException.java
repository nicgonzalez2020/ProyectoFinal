package Logicas;

/**
 * clase exception que se utiliza cuando se intenta alimentar a un habitat sin animales
 */
public class ComidaNoDefinidaException extends Exception {

    public ComidaNoDefinidaException(String errorMessage) {
        super(errorMessage);
    }
}
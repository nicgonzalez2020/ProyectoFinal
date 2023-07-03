package Logicas;

/**
 * Clase molde para los animales
 */
public abstract class Animal {

    /**
     * propiedades que indican el tipo de habitat compatible con el animal creado
     */
    int pradera=1;
    int polar=2;
    int acuario=3;
    int sabana=4;
    /**
     * propiedad que indica que animal es el creado
     */
    public int esp;

    /**
     * propiedades que indican el tipo de comida y tipo de habitat
     */
    public int tipohabitat;
    public int tipocomida;
    /**
     * propiedad que guarda la descripcion del animal
     */
    protected String descripcion;
    public Animal(){}

    /**
     * propiedad que retorna la descripcion del animal creado
     * @return propiedad descripcion
     */
    public String getDescripcion(){
        return descripcion;
    }


}

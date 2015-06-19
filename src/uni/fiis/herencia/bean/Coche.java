package uni.fiis.herencia.bean;

/**
 * Created by Dell on 05/06/2015.
 */
public class Coche extends Vehiculo {
    private Integer puertas;



    //Constructor
    public Coche(String color, Integer cv, Integer puertas){

        super(color, cv, 4);
        this.puertas= puertas;

    }

}

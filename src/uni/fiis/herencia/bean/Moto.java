package uni.fiis.herencia.bean;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Dell on 05/06/2015.
 */
public class Moto extends Vehiculo {


    private Boolean reparar_cadena;


    //Constructor
    public Moto(String color, Integer cv, Boolean reparar_cadena){

        super(color, cv, 2);
        this.reparar_cadena = reparar_cadena;

    }









}



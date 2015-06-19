package uni.fiis.herencia.bean;

/**
 * Created by Dell on 05/06/2015.
 */
public class Vehiculo {
    private String color;
    private Integer cv;
    private Integer velocidad;
    private Integer ruedas;
    private Integer cristales;


    public Vehiculo(String color, Integer cv, Integer ruedas){
        this.color = color;
        this.cv = cv;
        this.ruedas = ruedas;
        velocidad = 0;
    }


    //Gets
    public Integer getCv() {
        return cv;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public Integer getRuedas() {
        return ruedas;
    }



    //Metodos
    public void acelera (){
        velocidad+= cv/20;
    }

    public void frena(){
        velocidad = 0;
    }


}

package uni.fiis.herencia.bean;

/**
 * Created by Dell on 05/06/2015.
 */
public class Principal {
    public static void main(String[] args) {
        Coche c = new Coche("rojo", 100, 4);
        Moto m = new Moto("verde", 200, false);

        System.out.println("La velocidad del coche es: "+c.getVelocidad() );
        System.out.println("La velocidad de la moto es: "+m.getVelocidad() );

        c.acelera();
        m.acelera();

        System.out.println("La velocidad del coche es: " + c.getVelocidad());
        System.out.println("La velocidad de la moto es: " + m.getVelocidad());

    }
}

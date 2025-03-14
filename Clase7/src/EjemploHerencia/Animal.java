package EjemploHerencia;

/**
 *
 * @author Douglas Soch
 */
public class Animal {

    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        System.out.println(nombre + " esta comiendo.");
    }
    
}

package EjemploAbstraccion;

/**
 *
 * @author Douglas Soch
 */
abstract public class Animal {

    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void hacerSonido();

    public void mostrarNombre(){
        System.out.println("El nombre es: " + this.nombre);
    }
}

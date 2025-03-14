package EjemploHerencia;

/**
 *
 * @author Douglas Soch
 */
public class Gato extends Animal {

    String color;
    
    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public void maullar(){
        System.out.println(nombre + " esta maullando.");
    }

    @Override
    public void comer() {
        System.out.println("Mi gato " + nombre + " esta comiendo.");
    }
    
    
    
}

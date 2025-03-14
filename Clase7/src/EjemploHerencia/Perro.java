package EjemploHerencia;

/**
 *
 * @author Douglas Soch
 */
public class Perro extends Animal {

    String raza;
    
    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }
    
    public void ladrar(){
        System.out.println(raza + " esta ladrando.");
    }

    @Override
    public void comer() {
        System.out.println("Mi perro " + nombre + " esta comiendo");
    }
}

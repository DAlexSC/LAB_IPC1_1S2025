package EjemploInterface;

/**
 *
 * @author Douglas Soch
 */
public class Gato implements Animal, Raza {

    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau");
    }

    @Override
    public String obtenerNombreRaza(String nombre) {
        return "La raza del animal es: " + nombre;
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

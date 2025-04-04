package EjemploSerializacion_Deserializacion;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Douglas Soch
 */
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    public String nombre;
    public String apellido;
    // public ArrayList<String> nombres = new ArrayList<>();

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
}

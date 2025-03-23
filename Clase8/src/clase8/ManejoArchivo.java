package clase8;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Douglas Soch
 */
public class ManejoArchivo {

    public String leerArchivo(String ruta) {
        String respuesta = "";
        
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(ruta));
            String linea;
            
            while ((linea = buffer.readLine()) != null) {                
                respuesta += linea + "\n";
            }
        } catch (Exception e) {
            System.out.println("Error lectura archivo: " + e.getMessage());
        }

        return respuesta;
    }
    
}

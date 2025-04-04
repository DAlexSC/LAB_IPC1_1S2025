package EjemploSerializacion_Deserializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Douglas Soch
 */
public class AlmacenamientoInformacion {

    public void serializarUsuario(String nombre_archivo, Usuario usuario){
        
        try {
            FileOutputStream archivoSalida = new FileOutputStream(nombre_archivo);
            ObjectOutputStream salidaObjeto = new ObjectOutputStream(archivoSalida);
            salidaObjeto.writeObject(usuario);
            salidaObjeto.close();
            archivoSalida.close();
            System.out.println("Documento almacenado correctamente");
        } catch (IOException e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }
        
    }
    
    public Usuario deserializarUsuario(String nombre_archivo){
        try {
            FileInputStream archivoEntrada = new FileInputStream(nombre_archivo);
            ObjectInputStream entradaObjeto = new ObjectInputStream(archivoEntrada);
            Usuario usuario = (Usuario) entradaObjeto.readObject();
            entradaObjeto.close();
            archivoEntrada.close();
            System.out.println("Documento leido correctamente");
            return usuario;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }
        
        return null;
    }
    
}

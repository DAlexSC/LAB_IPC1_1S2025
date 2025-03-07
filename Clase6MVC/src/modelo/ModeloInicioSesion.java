package modelo;

/**
 *
 * @author Douglas Soch
 */
public class ModeloInicioSesion {

    public boolean verificarUsuario(String usuario, String contrasenia){
        if(usuario.equals("admin") && contrasenia.equals("123")){
            return true;
        }
        return false;
    }
    
}

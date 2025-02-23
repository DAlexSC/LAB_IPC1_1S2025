package modelo;

/**
 *
 * @author Douglas Soch
 */
public class InicioSesionModelo {

    private String usuario = "admin";
    private String contrasenia = "admin123";

    public boolean verificarUsuario(String usuario, String contrasenia){        
        if (this.usuario.equals(usuario) && this.contrasenia.equals(contrasenia)){
            return true;
        }        
        return false;
    }
    
}

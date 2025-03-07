package controlador;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ModeloInicioSesion;
import vistas.frmInicioSesion;
import vistas.frmMenuPrincipal;

/**
 *
 * @author Douglas Soch
 */
public class ControladorInicioSesion {

    frmInicioSesion vista;
    ModeloInicioSesion modelo;

    public ControladorInicioSesion(frmInicioSesion vista, ModeloInicioSesion modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void init(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.btnInicioSesion.addActionListener(verificacion());
    }
    
    private ActionListener verificacion (){
        return e -> {
            boolean respuesta = this.modelo.verificarUsuario(this.vista.txtUsuario.getText(), this.vista.txtContrasenia.getText());
            if (respuesta){
                this.vista.dispose();
                JOptionPane.showMessageDialog(null, "Inicio de sesion correcta", "Inicio sesion", JOptionPane.INFORMATION_MESSAGE);
                frmMenuPrincipal vistaMenuPrincipal = new frmMenuPrincipal();
                ControladorMenuPrincipal controladorMenuPrincipal = new ControladorMenuPrincipal(vistaMenuPrincipal);                
            } else {
                JOptionPane.showMessageDialog(null, "Usuario incorrecto", "Inicio sesion", JOptionPane.ERROR_MESSAGE);
            }
        };
    }
    
}

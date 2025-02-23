package controlador;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.InicioSesionModelo;
import modelo.MenuPrincipalModelo;
import vista.frmInicioSesion;
import vista.frmMenuPrincipal;

/**
 *
 * @author Douglas Soch
 */
public class InicioSesionControlador {

    private InicioSesionModelo modelo;
    private frmInicioSesion vista;

    public InicioSesionControlador(InicioSesionModelo modelo, frmInicioSesion vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniInterfaz() {
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.btnInicioSesion.addActionListener(iniciarSesion());
    }

    private ActionListener iniciarSesion() {
        return e -> {
            String usuario = this.vista.txtUsuario.getText();
            String contrasenia = this.vista.txtContrasenia.getText();
            boolean verificar = this.modelo.verificarUsuario(usuario, contrasenia);
            if (verificar) {
                
                MenuPrincipalModelo modelo_menu_principal = new MenuPrincipalModelo();
                frmMenuPrincipal vista_menu_principal = new frmMenuPrincipal();
                MenuPrincipalControlador controlador_menu_principal = new MenuPrincipalControlador(modelo_menu_principal, vista_menu_principal);
                
                this.vista.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            }
        };
    }

}

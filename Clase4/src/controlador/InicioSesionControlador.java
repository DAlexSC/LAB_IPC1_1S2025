package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.InicioSesionModelo;
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
    
    public void iniInterfaz(){
        this.vista.setVisible(true);
        this.vista.setLocationRelativeTo(null);
        this.vista.btnInicioSesion.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
              iniciarSesion();
            } 
        });
    }
    
    private void iniciarSesion (){
        String usuario = this.vista.txtUsuario.getText();
        String contrasenia = this.vista.txtContrasenia.getText();
        boolean verificar = this.modelo.verificarUsuario(usuario, contrasenia);
        if (verificar){
            frmMenuPrincipal menu = new frmMenuPrincipal();
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            this.vista.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }
    
}

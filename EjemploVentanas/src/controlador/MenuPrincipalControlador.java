package controlador;

import java.awt.event.ActionListener;
import modelo.MenuPrincipalModelo;
import vista.frmCreacionCliente;
import vista.frmCreacionCuenta;
import vista.frmMenuPrincipal;

/**
 *
 * @author Douglas Soch
 */
public class MenuPrincipalControlador {

    MenuPrincipalModelo menu_principal;
    frmMenuPrincipal vista_principal;

    public MenuPrincipalControlador(MenuPrincipalModelo menu_principal, frmMenuPrincipal vista_principal) {
        this.menu_principal = menu_principal;
        this.vista_principal = vista_principal;
        this.vista_principal.setSize(1000, 800);
        this.vista_principal.setLocationRelativeTo(null);
        this.vista_principal.setVisible(true);
        this.vista_principal.btnCreacionCliente.addActionListener(mostrarVistaCreacionCliente());
        this.vista_principal.btnCreacionCuenta.addActionListener(mostrarVistaCreacionCuenta());
    }
    
    private ActionListener mostrarVistaCreacionCliente (){
        return e -> {
            frmCreacionCliente vista_creacion_cliente = new frmCreacionCliente();
            vista_creacion_cliente.setLocationRelativeTo(null);
            vista_creacion_cliente.setVisible(true);            
        };
    }
    
    private ActionListener mostrarVistaCreacionCuenta(){
        return e -> {
            frmCreacionCuenta vista_creacion_cuenta = new frmCreacionCuenta();
            vista_creacion_cuenta.setLocationRelativeTo(null);
            vista_creacion_cuenta.setVisible(true);            
        };
    }
    
}

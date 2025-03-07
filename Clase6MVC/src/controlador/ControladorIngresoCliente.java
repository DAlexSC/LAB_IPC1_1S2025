package controlador;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.ModeloIngresoCliente;
import vistas.frmIngresoCliente;

/**
 * @author Douglas Soch
 */
public class ControladorIngresoCliente {

    frmIngresoCliente vista;
    ModeloIngresoCliente modelo;

    public ControladorIngresoCliente(frmIngresoCliente vista, ModeloIngresoCliente modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }
    
    public void init(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.btnIngreso.addActionListener(ingresoCliente());
    }
    
    public ActionListener ingresoCliente(){
        return e -> {
            boolean respuesta = this.modelo.ingresoCliente(this.vista.txtNombre.getText(), Integer.parseInt(this.vista.txtEdad.getText()));
            if (respuesta){
                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente", "Inicio sesion", JOptionPane.INFORMATION_MESSAGE);
                this.limpiarDatos();
            } else {
                JOptionPane.showMessageDialog(null, "El nombre del usuario esta repetido", "Inicio sesion", JOptionPane.ERROR_MESSAGE);
            }
        };
    }
    
    public void limpiarDatos(){
        this.vista.txtEdad.setText("");
        this.vista.txtNombre.setText("");
    }
    
}

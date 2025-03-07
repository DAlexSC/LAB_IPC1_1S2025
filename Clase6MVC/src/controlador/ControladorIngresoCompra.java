package controlador;

import java.awt.event.ActionListener;
import modelo.Cliente;
import modelo.ModeloIngresoCompra;
import vistas.frmIngresoCompra;

/**
 *
 * @author Douglas Soch
 */
public class ControladorIngresoCompra {

    frmIngresoCompra vista;
    ModeloIngresoCompra modelo;

    public ControladorIngresoCompra(frmIngresoCompra vista, ModeloIngresoCompra modelo) {
        this.vista = vista;
        this.modelo = modelo;
        this.modelo.obtenerClientes();
    }
    
    public void init(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
        this.vista.btnComprar.addActionListener(ingresoCompra());
        this.cargarClientesEnCBX();
    }
    
    public void cargarClientesEnCBX(){
        for (Cliente cliente : this.modelo.obtenerClientes()) {
            this.vista.cbxCliente.addItem(cliente.nombre);
        }
    }
    
    private ActionListener ingresoCompra (){
        return e -> {
            this.modelo.ingresarCompra(this.vista.cbxCliente.getSelectedItem().toString(), Float.parseFloat(this.vista.txtValorCompra.getText()));
        };
    }
    
}

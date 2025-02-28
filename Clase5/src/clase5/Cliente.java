package clase5;

import java.util.ArrayList;

/**
 *
 * @author Douglas Soch
 */
public class Cliente {

    int CUI;
    String nombre;
    ArrayList<Cuenta> cuentas_cliente = null;

    public Cliente(int CUI, String nombre) {
        this.CUI = CUI;
        this.nombre = nombre;
    }
    
    private void crearCuenta(){
        
    }

    @Override
    public String toString() {
        return "Cliente{" + "CUI=" + CUI + ", nombre=" + nombre + '}';
    }    
}

package modelo;

/**
 *
 * @author Douglas Soch
 */
public class ModeloIngresoCliente {

    public boolean ingresoCliente(String nombre, int edad) {

        for (Cliente cliente : ModeloDatos.clientes) {
            if (cliente.nombre.equals(nombre)) {
                return false;
            }
        }

        ModeloDatos.clientes.add(new Cliente(nombre, edad));
        return true;
    }

}

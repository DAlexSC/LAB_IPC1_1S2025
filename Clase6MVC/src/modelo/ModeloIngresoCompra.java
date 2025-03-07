package modelo;

import java.util.ArrayList;

/**
 *
 * @author Douglas Soch
 */
public class ModeloIngresoCompra {

   public ArrayList<Cliente>obtenerClientes (){
       return ModeloDatos.clientes;       
   }
   
   public void ingresarCompra(String nombre_cliente, float valor){
       
       ModeloDatos.compras.add(new Compra(nombre_cliente, valor));
       
   }
    
}

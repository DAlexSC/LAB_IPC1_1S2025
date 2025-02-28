package clase5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Douglas Soch
 */
public class EjemploArrayList {

    public void execute(){
        ArrayList<String> listado = new ArrayList<String>();
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su primer nombre");
        String nombre1 = leer.nextLine();
        listado.add(nombre1);
        System.out.println("Ingrese su segundo nombre");
        String nombre2 = leer.nextLine();
        listado.add(nombre2);
        System.out.println("Ingrese su primer apellido");
        String apellido1 = leer.nextLine();
        listado.add(apellido1);
        listado.remove(1);
        System.out.println(listado);
        System.out.println("Tamaño del listado: " + listado.size());
    }
    
    
    public void arrayObject (){
        Scanner leer = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el CUI del cliente");
            int CUI = leer.nextInt();
            System.out.println("Ingrese el nombre del cliente");
            String nombre = leer.next();
            clientes.add(new Cliente(CUI, nombre));
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(clientes.get(i).nombre);
        }
    }
    
}

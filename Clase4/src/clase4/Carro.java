package clase4;

/**
 *
 * @author Douglas Soch
 */
public class Carro {
    
    String marca;
    String modelo;
    int velocidad;
    
    public Carro (String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void acelerar(int incremento){
        this.velocidad += incremento;
        System.out.println("El carro de marca: " + this.marca + " y modelo: " + this.modelo + " va a una velocidad de: " + this.velocidad + " km/h");
    }
}

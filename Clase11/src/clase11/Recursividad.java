package clase11;

/**
 *
 * @author Douglas Soch
 */
public class Recursividad {

    public int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public boolean esPar(int n){
        if (n == 0){
            return true;
        }
        return this.esImpar(n - 1);
    }
    
    public boolean esImpar(int n){
        if (n == 0){
            return false;
        }
        return this.esPar(n - 1);
    }
    
}

package principal;

/**
 *
 * @author Antonio
 */
public class Hanoi extends Torres{
    private int numero;
    
    public Hanoi(int T1, int T2, int T3, int num)
    {
        super(T1,T2,T3);
        this.numero = num;
        
        
    }
    
     //Método Torres de Hanoi Recursivo
    private static void hacerHanoi(int n, int origen,  int auxiliar, int destino){
        if(n==1)
            System.out.println("mover disco de Torre " + origen + " a Torre " + destino);
        else{
            hacerHanoi(n-1, origen, destino, auxiliar);
             System.out.println("mover disco de Torre "+ origen + " a Torre " + destino);
             hacerHanoi(n-1, auxiliar, origen, destino);
            }
        
        }
    
    public void ejecutarHanoi(){
        hacerHanoi(this.numero,getTorre1(),getTorre2(),getTorre3());
    }
    
    
    
}

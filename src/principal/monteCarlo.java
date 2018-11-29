package principal;

/**
 *
 * @author Antonio
 */
public class monteCarlo {
    private int totalSimulaciones;
    private float suma;
    private float resultado;
    private static monteCarlo montecarlo;
    
    //IMPLEMENTANDO PATRON SINGLETON
    private monteCarlo(int t, float s, float r){
        this.totalSimulaciones = t;
        this.suma = s;
        this.resultado = r;
    }
    
    public static monteCarlo getSingletonInstance(int t, float s, float r){
        if(montecarlo == null){
            montecarlo = new monteCarlo(t,s,r);
        }
        else{
            System.out.println("No se puede crear los objeto porque ya existe un objeto de la clase monteCarlo");
        }
        return montecarlo;
    }
    
    //METODOS GET
    public int getTotalSimulaciones(){
        return this.totalSimulaciones;
    }
    public float getSuma(){
        return this.suma;
    }
    public float getResultado(){
        return this.resultado;
    }
    
    //*************************************************
    public void simularMonteCarlo(){
 
        for(int i = 0; i < this.totalSimulaciones; i++){
            this.suma = (float) (this.suma + Math.random());
        }
        this.resultado = this.suma/this.totalSimulaciones;
    }
}

/*Hacer un programa en Java que muestre el siguiente menú
- 1. Resolver las torres de Hanoi
- 2. Simular Montecarlo
- 3. Salir*/
package principal;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int opc;
        int circulo;
        int total;
        
        
        
        do{
            System.out.println("1. Resolver las Torres de Hanoi");
            System.out.println("2. Simulacion montecarlo");
            System.out.println("3. Salir");
            do{
                System.out.print(">>");
                opc = leer.nextInt();
            }while(opc<1 || opc >3);
            
            switch(opc){
                case 1:
                    System.out.print("Ingrese el numero de circulos\n>>");
                    circulo = leer.nextInt();
                    Hanoi h = new Hanoi(1,2,3,circulo);
                    h.ejecutarHanoi();
                    System.out.println("Fin");
                    System.out.println("\n\n");
                    break;
                case 2:
                    System.out.print("Ingrese el total de simulaciones que desea\n>>");
                    total = leer.nextInt();
                    monteCarlo mC = monteCarlo.getSingletonInstance(total, 0, 0);
                    mC.simularMonteCarlo();
                    System.out.println("El resultado de la simulacion montecarlo fue: "+mC.getResultado());
                    System.out.println("\n\n");
                    break;
                case 3:
                    break;
        }
        }while(opc != 3);
    }
    
}

import java.util.Scanner;
/**
 *@author AndresAFB
 *@version 1.0
 */
public class Numero {

	public static void main(String[] args) {
		

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero");
        
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        
        sc.close();
	
		if (numero1 < 1000 && numero1 > 0) {
			System.out.println("El numero1 es menor que 1000 y mayor que 0");
		} else {
		System.out.println("El numero1 no es válido");
		}
		
		if (numero2 < 1000 && numero2 > 0) {
			System.out.println("El numero2 es menor que 1000 y mayor que 0");
		} else {
		System.out.printf("El numero2 no es válido%n");
		}
		
		//Segundo punto
		if (numero1 > numero2) {
			System.out.printf("%d es mayor%n", numero1);
		} else if (numero1 < numero2){
			System.out.printf("%d es mayor%n", numero2);
		} if ( numero1 == numero2) {
			System.out.printf("El %d es igual%n", numero1);
		}
	

		for (int contador = 1; contador <= 10 ; contador++ ) { 
			int resultado= contador * 3 * numero1;	
            System.out.println("multiplo de " + numero1 + " " + contador + " = "+ resultado);
		}
		
		int numero = numero1;
		int numeroInvertido =0;
		int cuenta = 0;
		while(cuenta !=0) {
			cuenta= numero%10;
			numeroInvertido = numeroInvertido * 10 + cuenta;
			numero = numero /10;
		}
	    if(numeroInvertido==numero){
	        System.out.printf("El numero es capicua\n");
	       }else {
	        System.out.printf("El numero no es capicua\n");
		}
	}
}

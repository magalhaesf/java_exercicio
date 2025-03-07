import java.util.Scanner;

	public class par{

		public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);

			int numero;
			int calculo;
		
			System.out.println("Digite um numero:");
			numero = sc.nextInt();

			System.out.println();

			int i= numero;

			if(i % 2 == 0){

			
			System.out.println("\nResultados:\n");
			System.out.println("Numero par!");
			}
			
			else 

			System.out.println("Numero impar!");
			
			
		}
	}
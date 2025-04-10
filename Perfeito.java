import java.util.Scanner;

public class Perfeito {

    public static boolean numeroPerfeito(int numero) {
        int soma = calcularDivisorSoma(numero, numero / 2);
        return soma == numero;
    }
    
    public static int calcularDivisorSoma(int numero, int divisor) {
        if (divisor == 1) {
            return 1;
        }
        
        if (numero % divisor == 0) {
            return divisor + calcularDivisorSoma(numero, divisor - 1);
        } else {
            return calcularDivisorSoma(numero, divisor - 1);
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = sc.nextInt() ; 
        
        if (numeroPerfeito(numero)) {
            System.out.println(numero + " e um numero perfeito.");
        } else {
            System.out.println(numero + " nao e um numero perfeito.");
        }
        sc.close();
    }
}
			


		
        
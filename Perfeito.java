import java.util.Scanner;

class Perfeito {
    
    public static boolean isPerfectNumber(int number) {
        int sum = calculateDivisorSum(number, number / 2);
        return sum == number;
    }
    
    public static int calculateDivisorSum(int number, int divisor) {
        if (divisor == 1) {
            return 1;
        }
        
        if (number % divisor == 0) {
            return divisor + calculateDivisorSum(number, divisor - 1);
        } else {
            return calculateDivisorSum(number, divisor - 1);
        }
    }
    
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.println("Digite um numero");
        int number = sc.nextInt() ; 
        
        if (isPerfectNumber(number)) {
            System.out.println(number + " e um numero perfeito.");
        } else {
            System.out.println(number + " nao e um numero perfeito.");
        }
    }
}
			


		
        
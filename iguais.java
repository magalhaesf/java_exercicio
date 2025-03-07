import java.util.Scanner;

public class iguais{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        String a;
        String b;

        System.out.println("Digite alguma coisa:");
        a = sc.nextLine();

        System.out.println("Digite outra coisa:");
        b = sc.nextLine();

            if(a == b){
            
            System.out.println("Sao iguais");
              
        }

            else {
                System.out.println("Sao coisas diferentes");

        }
    }


}
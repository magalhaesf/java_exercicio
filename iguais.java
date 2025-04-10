import java.util.Scanner;

public class Iguais{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String texto1;
        String texto2;

        System.out.println("Digite alguma coisa:");
        texto1 = sc.nextLine();

        System.out.println("Digite mais alguma coisa:");
        texto2 = sc.nextLine();

        if( texto1.equals(texto2) ){  
            System.out.println("Sao iguais");
              
        } else {
            System.out.println("Sao coisas diferentes");
        }
        sc.close();
    }
}
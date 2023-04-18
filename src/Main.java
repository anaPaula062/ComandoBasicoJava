import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroUm;
        int numeroDois;

        System.out.println("Numero Um");
        numeroUm = scan.nextInt();

        System.out.println("Numero Dois");
        numeroDois = scan.nextInt();

        if(numeroUm > numeroDois){
            System.out.println("O numero um é maior");
        }else if(numeroDois > numeroUm){
            System.out.println("O numero dois é maior");
        }
    }
}
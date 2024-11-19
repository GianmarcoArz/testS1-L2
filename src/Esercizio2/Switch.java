package Esercizio2;

import java.util.Scanner;

public class Switch {

    public static String convertiNumeroInParole(int numero) {
        switch(numero) {
            case 0:
                return "zero";
            case 1:
                return "uno";
            case 2:
                return "due";
            case 3:
                return "tre";
            default:
                return "hai cagato";
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero (tra 0 e 3): ");
        int numero = scanner.nextInt();


        System.out.println(convertiNumeroInParole(numero));

        scanner.close();

    }
}

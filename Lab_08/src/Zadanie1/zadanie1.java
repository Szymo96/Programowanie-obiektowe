package Zadanie1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe: ");
        Scanner input = new Scanner(System.in);
        double userInput = 0;

        while (true) {

            try {
                userInput = input.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("podaj poprawna liczbe!");
                input.next();
            }

        }//koniec while

        if (userInput < 0) {
            throw new IllegalArgumentException(String.format("pierwiastek z liczby rzeczywistej %.4f nie istnieje!! ", userInput));
        }
        System.out.println(String.format("pierwiastek z liczby rzeczywistej %.4f to %.4f!! ", userInput, Math.sqrt(userInput)));
    }// koniec main
}

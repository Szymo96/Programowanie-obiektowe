import java.util.Scanner;

import static java.lang.Math.*;


public class Main {
    public static void main(String[] args) {
        System.out.println(getImie());
        System.out.println(getWiek());
        Obliczenia(5, 4);
        System.out.println(czyParzysta(5));
        System.out.println(czyPodzielna(10));
        System.out.println(potega(5));
        System.out.println(pierwiastek(25));
        System.out.println(trojkat(11,13,44));
    }

    public static String getImie() {
        return "Jan";
    }

    public static int getWiek() {
        return 20;
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void Obliczenia(double a, double b) {
        System.out.println("Suma: " + a + " + " + b + " = " + (a + b));
        System.out.println("Różnica: " + a + " - " + b + " = " + (a - b));
        System.out.println("Iloczyn: " + a + " * " + b + " = " + (a * b));
    }

    public static boolean czyParzysta(int a) {
        if (a % 2 == 0) return true;
        return false;
    }

    public static boolean czyPodzielna(int a) {
        if ((a % 3 == 0) && (a % 5 == 0)) return true;
        return false;
    }

    public static double potega(int a) {
        double potegowanie = pow(a, 3);
        return potegowanie;
    }

    public static double pierwiastek(int a) {
        double pierw = sqrt(a);
        return pierw;
    }

    public static boolean trojkat(int a, int b, int c) {
        System.out.println("Podaj odcinek a trójkąta: ");
        a = getInt();
        System.out.println("Podaj odcinek b trójkąta: ");
        b = getInt();

        double powA = pow(a, 2);
        double powB = pow(b, 2);
        double powC = powA + powB;

        if(powC == powA + powB) return true;
        return false;





    }


}
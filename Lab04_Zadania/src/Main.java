import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();
        //Zadanie5();
        Zadanie6();

        //  Dlugosc();
        //  Rozmiar();
        //For();
        //ForEach();
        /*
        double[] data;
        data = new double[10];

        double[] data1 = new double[10];
        String[] slowa = new String[]{"ala", "ma", "kota"};

        int[] tab = {3, 4, 6, 8, 21, 45};
        System.out.println("element: " + tab[0]);

        int [][]tabA = new int[3][4];
        double [][][] Tab3D = new double[2][4][6];

        int [][] tab2D = {
                {1,2,3},
                {4,5,6,7,8},
                {7},
        };

        for(int i = 0; i < tab2D.length; ++i) {
            for (int j = 0; j < tab2D[i].length; ++j) {
                System.out.print(tab2D[i][j] + "\t");
            }
            System.out.println();
        }*/
    }

    public static void Dlugosc() {
        int[] liczby = new int[5];
        double[] liczbyD = new double[]{3.14, 3.23123, 4.32};
        System.out.println("Liczba elementow tablicy: " + liczby.length);
        System.out.println("Liczba elementow tablicy: " + liczbyD.length);
    }

    public static void Rozmiar() {
        String tekst = "tekst";
        String[] slowa = new String[]{"ala", "ma", "kota"};
        System.out.println("Liczba slow w slowa: " + tekst.length());
        System.out.println("Liczba elementów w tablicy: " + slowa.length);
        System.out.println("Liczba znakow w pierwszym elemencie tablicy: " + slowa[0].length());
    }

    public static void For() {
        int[] tab = {1, 2, 3, 4};
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
    }

    public static void ForEach() {
        int[] tab = {1, 2, 3, 4};
        for (int i : tab) {
            System.out.println(i);
        }
    }

  /*  public static void Losuj() {
        int a = 0;
        Random rand = new Random();
        a = rand.nextInt(99);
    }*/

    public static void Zadanie1() {
        Random rand = new Random();

        double suma = 0, suma1 = 0;
        double srednia = 0, srednia1 = 0;
        int[] tab = new int[10];

        for (int i = 0; i < 10; i++) {
            tab[i] = rand.nextInt(10);
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        for (int i = 0; i < tab.length - 1; ++i) {
            suma += tab[i];
            srednia = suma / tab.length;
        }
        System.out.println('\n' + "Pętla for");
        System.out.println("Suma elementów tablicy wynosi: " + suma);
        System.out.println("Srednia wynosi: " + srednia);
        System.out.println();

        for (int i : tab) {
            suma1 = suma1 + i;
            srednia1 = suma1 / tab.length;
        }
        System.out.println('\n' + "Pętla for each");
        System.out.println("Suma elementów tablicy wynosi: " + suma1);
        System.out.println("Srednia wynosi: " + srednia1);
        System.out.println();
    }

    public static void Zadanie2() {
        int[] pierwsza = {1, 2, 3, 4, 5, 6};
        int[] druga = {2, 4, 6, 8, 10};

        for (int i = 1; i < pierwsza.length; i = i + 2) {
            System.out.print(pierwsza[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < druga.length; i = i + 2) {
            System.out.print(druga[i] + " ");
        }
    }

    public static void Zadanie3() {
        String[] tab = {"mleko", "masło", "pomidory"};
        for (String i : tab) {
            System.out.println(i.toUpperCase() + " ");
        }
    }

    public static void Zadanie4() {
        String[] slowa = new String[5];


        System.out.println("Podaj 5 słow: ");
        for (int i = 0; i < slowa.length; i++) {
            System.out.print((i + 1) + " slowo: ");
            slowa[i] = getString();
        }

        for (int i = slowa.length - 1; i >= 0; i--) {
            for (int j = slowa[i].length() - 1; j >= 0; j--) {
                System.out.print(slowa[i].charAt(j));
            }
            System.out.println();
        }
    }

    public static String getString() {
        return new Scanner(System.in).next();
    }

    public static void Zadanie5() {
        //int length = 8;
        int pom = 0, j = 0;
        int[] liczby = new int[8];
        System.out.println("Podaj osiem liczb:");

        for (int i = 0; i < liczby.length; i++) {
            System.out.print((i + 1) + " liczba: ");
            liczby[i] = getInt();
        }
        System.out.println("Podane liczby: ");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + " ");
        }

        for (int i = 0; i < liczby.length; i++) {
            pom = liczby[i];
            j = i - 1;
            while (j >= 0 && liczby[j] >= pom) {
                liczby[j + 1] = liczby[j];
                --j;
            }
            liczby[j + 1] = pom;
        }
        System.out.println();
        System.out.println("Posortowane liczby: ");
        for (int i = 0; i < liczby.length; i++) {
            System.out.print(liczby[i] + " ");
        }
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void Zadanie6() {
        int length = 5;
        int[] tab = new int[length];
        int[] silnia = new int[length];
        int sil = 1;
        System.out.println("Podaj pięć liczb: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print((i + 1) + " liczba: ");
            tab[i] = getInt();
        }
        System.out.print("Podane liczby: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        for(int j = 0; j < tab.length; j++) {
            for (int i = 1; i <= tab[j]; i++) {

            }
        }

     //   System.out.println("silnia = " + sil);
    }
}
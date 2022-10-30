import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        //Zadanie4();
        Zadanie5();
    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void Zadanie1() {
        int lPkt, suma = 0, ile = 0;
        System.out.println("Podaj liczbę studentów w grupie: ");
        int n = getInt();
        if (n > 0) {
            while (n > 0) {
                System.out.println("Podaj lp pkt 0 - 40");
                lPkt = getInt();
                if (lPkt >= 0 && lPkt <= 40) {
                    suma += lPkt;
                    n--;
                    ile++;
                }
                continue;
            }//koniec while
            System.out.println("Suma: " + suma);
            System.out.println("Średnia: " + (double) (suma / ile));  //rzutowanie zmiennej

        } else System.out.println("W grupie musi być conajmniej 1 osoba");
    }

    public static void Zadanie2() {
        int dodatnie = 0, ujemne = 0, sumaD = 0, sumaU = 0;
        System.out.println("Podaj 10 liczb dodatnich i ujemnych: ");
        for (int n = 0; n < 10; n++) {
            int a = getInt();
            if (a > 0) {
                dodatnie++;
                sumaD += a;
            }
            if (a < 0) {
                ujemne++;
                sumaU += a;
            }
        }
        System.out.println("Ilość liczb dodatnich: " + dodatnie);
        System.out.println("Suma liczb dodatnich wynosi: " + sumaD);
        System.out.println("Ilość liczb ujemnych: " + ujemne);
        System.out.println("Suma liczb ujemnych wynosi: " + sumaU);
    }

    public static void Zadanie3() {
        int suma = 0, a = 0;
        System.out.println("Podaj ile liczb wypisac: ");
        int n = getInt();
        for (int i = 0; i < n; i++) {
            a++;
            System.out.printf(" " + a);
            if (a % 2 == 0) {
                suma += a;
            }
        }
        System.out.println('\n' + "Suma liczb przystych wynosi: " + suma);
    }

    public static void Zadanie4() {
        int suma = 0, a = 0;
        Random rand = new Random();
        System.out.printf("Podaj ile liczb z przedziału (-10,45) mam wypisać: ");
        int n = getInt();
        for (int i = 0; i < n; i++) {
            a = rand.nextInt(45) - 10;
            System.out.printf(" " + a);
            if (a % 2 == 0) {
                suma += a;
            }
        }
        System.out.println('\n' + "Suma liczb parzystych w podanym ciągu wynosi: " + suma);
    }

    public static void Zadanie5() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Podaj jeden wyraz: ");
        String a = sc.nextLine();
        int n = a.length();

        int x = 0;
        int y = (n - 1);
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != a.charAt(y)) {
                x = 1;
                break;
            }
            y--;
        }
        if (x == 1) {
            System.out.println("Podany wyraz nie jest palindromem");
        } else {
            System.out.println("Podany wyraz jest palindromem");
        }

    }
}


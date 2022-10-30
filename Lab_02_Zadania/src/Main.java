import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.Math.*;


public class Main {
    public static void main(String[] args) {
        //Zadanie1();
        //Zadanie2();
        //Zadanie3();
        Zadanie4();
        //Zadanie5();
        //Zadanie6();

    }

    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void Zadanie1() {

        double delta = 0;
        double x = 0, x1 = 0, x2 = 0;

        System.out.println("Podaj wartości dla równania kwadratowego ax^2+bx+c=0");
        System.out.printf("Podaj wartość a: ");
        double a = getInt();
        System.out.printf("Podaj wartość b: ");
        double b = getInt();
        System.out.printf("Podaj wartość c: ");
        double c = getInt();
        System.out.println("Twoje równanie kwadratowe: " + a + "x^2 + " + b + "x + " + c + " = 0");

        delta = (b * b) - 4 * a * c;
        System.out.println("Delta wynosi: " + delta);

        double pD = sqrt(delta);
        //System.out.println("Pierwiastek z delty wynosi: "+pD);

        if (delta > 0) {

            x1 = ((-b) + (-pD)) / (2 * a);
            x2 = ((-b) + pD) / (2 * a);
            System.out.println("Delta większa od zera.");
            System.out.println("Miejsca zerowe to: ");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            x = (-b) / (2 * a);
            System.out.println("Delta równa zero");
            System.out.println("Miejsce zerowe to: ");
            System.out.println("x0 = " + x);
        } else {
            System.out.println("Delta jest mniejsza od zera. Brak pierwiastków");
        }

    }

    public static void Zadanie2() {
        double a = 0, b = 0, c = 0;

        System.out.println("Dane funkcje: ");
        System.out.println("a(x) = \n 2x dla x>0 \n 0 dla x=0 \n -3x dla x<0" + '\n');

        System.out.println("b(x) = \n x^2 dla x>=1 \n x dla x<1" + '\n');

        System.out.println("c(x) = \n 2 + x dla x>2 \n 8 dla x=2 \n x-4 dla x<2" + '\n');


        System.out.println("Podaj wartość argumentu x dla funkcji: ");
        int x = getInt();

        System.out.println("Którą funkcje wykonać: \n 1. a \n 2. b \n 3. c");
        int n = 3;
        n = getInt();
        switch (n) {
            case 1:
                if (x > 0) {
                    a = 2 * x;
                    System.out.println("a(x) = " + a);
                } else if (x == 0) {
                    a = 0;
                    System.out.println("a(x) = " + a);
                } else {
                    a = (-3) * x;
                    System.out.println("a(x) = " + a);
                }
                break;
            case 2:
                if (x >= 1) {
                    b = pow(x, 2);
                    System.out.println("b(x) = " + b);
                } else {
                    b = x;
                    System.out.println("b(x) = " + b);
                }
                break;
            case 3:
                if (x > 2) {
                    c = 2 + x;
                    System.out.println("c(x) = " + c);
                } else if (x == 2) {
                    c = 8;
                    System.out.println("c(x) = " + c);
                } else {
                    c = x - 4;
                    System.out.println("c(x) = " + c);
                }
                break;
        }


    }

    public static void Zadanie3() {
        int x = 0, y = 0, z = 0, pom = 0;
        int[] tab = new int[3];
        System.out.println("Podaj wartość x: ");
        x = getInt();
        System.out.println("Podaj wartość y: ");
        y = getInt();
        System.out.println("Podaj wartość z: ");
        z = getInt();
        tab[0] = x;
        tab[1] = y;
        tab[2] = z;

        System.out.println("Podane liczby: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(tab[i]);
        }
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 2; j++) {
                if (tab[j] > tab[j + 1]) {
                    pom = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = pom;
                }
            }
        System.out.println("Liczby posortowane: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(tab[i]);
        }


    }

    public static void Zadanie4() {
        //int pada = 1, autobus = 1;
        System.out.println("Podaj czy pada deszcz: 1 (pada), 0 (nie pada)");
        int pada = getInt();
        if (pada != 1 && pada != 0) {
            System.out.println("Podano złą wartość");
            return;
        }
        System.out.println("Podaj czy autobus jest na przystanku: 1 (jest), 0 (nie ma)");
        int autobus = getInt();
        if (autobus != 1 && autobus != 0) {
            System.out.println("Podano złą wartość");
            return;
        }
        //Jeśli pada deszcz i jest autobus na przystanku, to „Weź parasol”, „Dostaniesz się na uczelnie”
        if (pada == 1 && autobus == 1)
            System.out.println("Weź parasol. Dostaniesz się na uczelnie");
            //Jeśli pada deszcz i nie ma autobusu, to „Nie dostaniesz się na uczelnię”
        else if (pada == 1 && autobus != 1)
            System.out.println("Nie dostaniesz się na uczelnie");
            //Jeśli nie pada deszcz i jest autobus na przystanku, to „Dostaniesz się na uczelnie”,
            // „Miłego dnia i pięknej pogody”
        else if (pada != 1 && autobus == 1)
            System.out.println("Dostaniesz się na uczelnie. Miłego dnia i pięknej pogody");

    }

    public static void Zadanie5() {
        System.out.println("Czy jest zniżka na samochód: 1 (tak), 0 (nie ma)");
        int znizka = getInt();
        if (znizka != 1 && znizka != 0) {
            System.out.println("Podano złą wartość");
            return;
        }
        System.out.println("Czy dostałeś premię: 1 (tak), 0 (nie ma)");
        int premia = getInt();
        if (premia != 1 && premia != 0) {
            System.out.println("Podano złą wartość");
            return;
        }

        //Jeśli nie ma zniżki na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”, „Zniżki
        //na samochód nie ma”
        if (znizka != 1 || premia == 1)
            System.out.println("Możesz kupić samochód ! Zniżki na samochód nie ma");

        //Jeśli nie ma zniżki na samochód lub nie otrzymałeś premii, to „Zakup samochód trzeba odłożyć
        //na później...”, „Zniżki na samochód nie ma”
        if (znizka != 1 || premia != 1)
            System.out.println("Zakup samochód trzeba odłożyć na później. Zniżki na samochód nie ma");

        //Jeśli jest zniżka na samochód lub otrzymałeś premię, to „Możesz kupić samochód !”
        if (znizka == 1 || premia == 1)
            System.out.println("Możesz kupić samochód !");
    }

    public static void Zadanie6() {
        double x = 0, y = 0;
        int n = 5;
        System.out.println("Prosty kalkulator");
        System.out.println("Podaj dwie liczby: ");
        x = getInt();
        y = getInt();
        System.out.println("Jakie działanie chcesz wykonać: \n 1. + \n 2. - \n 3. * \n 4. / \n 5. MOD ");
        n = getInt();
        switch (n) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                if (y == 0)
                    System.out.println("Nie dzielimy przez 0");
                else System.out.println(x / y);
                break;
            case 5:
                if (y == 0)
                    System.out.println("Nie dzielimy przez 0");
                else System.out.println(x % y);
                break;
            default:
                System.out.println("Podano złą wartość!");
        }
    }
}
package Zadanie2;

class BlednaWartoscDlaSilniExeption extends Exception {
    public BlednaWartoscDlaSilniExeption(String message) {
        super(message);
    }
}

public class zadanie2 {

    public static void main(String[] args) {
        try {
            System.out.println("5n! = "+silnia(5));
            System.out.println("-2n! = "+silnia(-2));

        }
        catch(BlednaWartoscDlaSilniExeption e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static int silnia (int n) throws BlednaWartoscDlaSilniExeption {
        if (n < 0) {
            throw new BlednaWartoscDlaSilniExeption("Silnia z liczby mniejszej od zera nie istnieje!!!");
        }
        int result = 1;
        for (int i = 0; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

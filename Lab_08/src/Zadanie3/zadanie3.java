package Zadanie3;

class AdresError extends Exception {
    public AdresError(String message) {
        super(message);
    }
}

public class zadanie3 {
    public static void main(String[] args) {
        try {
            zadanie3 adres = new zadanie3("sucharskiego", "", "rzeszów", 2);
        } catch (AdresError e) {
            System.out.println("Blad adresu: " + e.getMessage());
        }
        try {
            zadanie3 adres = new zadanie3("sucharskiego", null, "rzeszów", 2);
        } catch (AdresError e) {
            System.out.println("Blad adresu: " + e.getMessage());
        }
        try {
            zadanie3 adres = new zadanie3("sucharskiego","35-652", "rzeszów", -2 );
        }catch (AdresError e){
            System.out.println("Blad adresu: "+e.getMessage());
        }
        try {
            zadanie3 adres = new zadanie3(null,null, null, 0 );
        }catch (AdresError e){
            System.out.println("Blad adresu: "+e.getMessage());
        }

    }

    String ulica, kodPocztowy, miasto;
    int nrDomu;

    public zadanie3(String ulica, String kodPocztowy, String miasto, int nrDomu) throws AdresError {

        String error = "";

        if (ulica == null) error += "Ulica nie może być null";
        if (kodPocztowy == null) error += "Kod pocztowy nie może być null";
        if (miasto == null) error += "Miasto nie może być null";
        if (nrDomu <= 0) error += "Nr domu musi być liczbą > 0";
        if (!error.equals("")) throw new AdresError(error);


        this.ulica = ulica;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.nrDomu = nrDomu;
    }
}

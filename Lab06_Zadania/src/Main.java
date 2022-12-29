public class Main {
    public static void main(String[] args) {

        Punkt pkt1 = new Punkt(2.3, 3.5);
        pkt1.Opis();
        pkt1.Przesun(1.2, -1);
        pkt1.Opis();

        Prostokat p1 = new Prostokat(2, 4);
        Trojkat t1 = new Trojkat(5, 2.5);
        Figura f1 = new Figura();
        Okrąg o1 = new Okrąg();

        System.out.println("Pole prostokąta: " + p1.getPowierzchnia());
        System.out.println(f1.opis());

    }
}
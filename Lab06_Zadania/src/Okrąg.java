public class Okrąg {
    public Punkt srodek;
    public double promień;

    public Okrąg() {
        srodek.x = 0;
        srodek.y = 0;
        promień = 0;
    }

    public Okrąg(Punkt srodek, double promień) {
        this.srodek = srodek;
        this.promień = promień;
    }

    public double getPow() {
        return Math.PI * Math.pow(promień, 2);
    }

    public double srednia() {
        return 2 * promień;
    }

    public void setPromień(double promień) {
        this.promień = promień;
    }

    public double getPromień() {
        return promień;
    }

    public void wSrodku(Punkt p) {
        double lewaStrona = Math.pow((srodek.x - p.x), 2) + Math.pow((srodek.y - p.y), 2);
        double prawaStrona = Math.pow(promień, 2);

        if (lewaStrona >= prawaStrona)
            System.out.println("Pkt. [" + p.x + ", " + p.y + "] , znajduje sie wewnatrz okregu");
        else System.out.println("Punkt znajduje sie poza okregiem");

    }

}

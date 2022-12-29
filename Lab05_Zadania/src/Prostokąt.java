public class Prostokąt {

    double dlugosc, szerokosc;

    public Prostokąt() {
    }

    public Prostokąt(double dlugosc, double szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getPole(){
        return szerokosc * dlugosc;
    }

    public double getObwod(){
        return 2*dlugosc + 2*szerokosc;
    }

    public double getPrzekatna(){
        double c = Math.pow(dlugosc,2)+Math.pow(szerokosc,2);

        return Math.sqrt(c);
    }

}

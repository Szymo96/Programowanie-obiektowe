public class Punkt {
    public double x, y;


    public Punkt() {
        this.x = x;
        this.y = y;

    }

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void Zeruj(){
        x=0.0;
        y=0.0;
    }

    public void Opis(){
        System.out.println("Pkt. o wsp. [x,y]: ["+x+", "+y+"]");
    }
    public void Przesun(double x, double y){
        this.x+=x;
        this.y+=y;
    }
}

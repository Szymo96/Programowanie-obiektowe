package Zadanie1;

import java.util.Objects;

public class Uczestnicy {

    int id, wiek;
    String imie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public Uczestnicy(int id, int wiek, String imie) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczestnicy that = (Uczestnicy) o;
        return id == that.id && wiek == that.wiek && imie.equals(that.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, wiek, imie);
    }

    @Override
    public String toString() {
        return "Uczestnicy{" +
                "id=" + id +
                ", wiek=" + wiek +
                ", imie='" + imie + '\'' +
                '}';
    }
}

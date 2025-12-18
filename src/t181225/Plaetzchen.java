package t181225;

public class Plaetzchen {
    String sorte;
    int anzahl;

    public Plaetzchen(String sorte, int anzahl) {
        sorte = sorte;
        anzahl = anzahl;
    }

    public String toString() {
        return anzahl + "x " + sorte;
    }
}


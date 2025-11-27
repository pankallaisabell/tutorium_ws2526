package t271125;

public class Geschenk {
    private String name;
    private int gewicht; // in Gramm

    public Geschenk(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }

    public String getName() { return name; }
    public int getGewicht() { return gewicht; }

    @Override
    public String toString() {
        return name + " (" + gewicht + "g)";
    }
}

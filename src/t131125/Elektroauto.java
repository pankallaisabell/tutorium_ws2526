package t131125;

public class Elektroauto extends Auto {
    private int akkuStand; // in Prozent

    // Konstruktor
    public Elektroauto(String marke, int baujahr, int akkuStand) {
        super(marke, baujahr); // Ruft den Konstruktor der Elternklasse auf
        this.akkuStand = akkuStand;
    }

    // Methode zum Laden des Akkus
    public void laden(int prozent) {
        this.akkuStand += prozent;

        // Maximal 100% erlauben
        if (this.akkuStand > 100) {
            this.akkuStand = 100;
        }
    }

    // Überschriebene toString-Methode
    @Override
    public String toString() {
        return super.toString() + String.format(" | Akkustand: %d%%", this.akkuStand);
    }
}

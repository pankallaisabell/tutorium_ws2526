package t131125;

public class Auto {
    private String marke;
    private int baujahr;
    private double geschwindigkeit;

    // Statisches Attribut zum Zählen der Auto-Objekte
    private static int anzahlAutos = 0;

    // Konstruktor
    public Auto(String marke, int baujahr) {
        this.marke = marke;
        this.baujahr = baujahr;
        this.geschwindigkeit = 0.0;

        // Zähler erhöhen bei jedem neuen Auto
        anzahlAutos++;
    }

    // Statische Methode zum Abrufen der Anzahl
    public static int getAnzahlAutos() {
        return anzahlAutos;
    }

    // Methode zum Beschleunigen
    public void beschleunigen(double wert) {
        this.geschwindigkeit += wert;
    }

    // Methode zum Bremsen
    public void bremsen(double wert) {
        this.geschwindigkeit -= wert;
        if (this.geschwindigkeit < 0) {
            this.geschwindigkeit = 0;
        }
    }

    // toString-Methode für schöne Ausgabe
    @Override
    public String toString() {
        return String.format("Auto: %s (Baujahr: %d) - Geschwindigkeit: %.2f km/h",
                this.marke, this.baujahr, this.geschwindigkeit);
    }

    // Überschriebene equals-Methode
    @Override
    public boolean equals(Object obj) {
        // Prüfe, ob es dasselbe Objekt ist
        if (this == obj) {
            return true;
        }

        // Prüfe, ob obj null ist oder eine andere Klasse hat
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Konvertiere zu Auto und vergleiche Marke und Baujahr
        Auto anderesAuto = (Auto) obj;
        return this.baujahr == anderesAuto.baujahr &&
                this.marke.equals(anderesAuto.marke);
    }
}
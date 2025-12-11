package t111225;

abstract class Veranstaltung implements Sortierbar {
    private String titel;
    private String ort;

    public Veranstaltung(String titel, String ort) {
        this.titel = titel;
        this.ort = ort;
    }

    public String getTitel() { return titel; }
    public String getOrt() { return ort; }

    // Hilfsmethode für Polymorphie (ermöglicht Zugriff auf Datum in 'vergleiche')
    public abstract Datum getStartDatum();

    @Override
    public int vergleiche(Veranstaltung v) {
        // Wir delegieren den Vergleich an die Datum-Klasse
        long meinDatum = this.getStartDatum().toSortableInt();
        long anderesDatum = v.getStartDatum().toSortableInt();

        // Rückgabe: <0 wenn kleiner, 0 wenn gleich, >0 wenn größer
        // Beispiel: Wenn meinDatum der 14.12.2025 ist und anderesDatum der 20.12.2025, kommt ein negativer Wert (-1) heraus.
        return Long.compare(meinDatum, anderesDatum);
    }
}

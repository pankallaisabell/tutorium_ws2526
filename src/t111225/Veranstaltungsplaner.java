package t111225;

class VeranstaltungsPlaner {
    private Veranstaltung[] veranstaltungen;
    private int anzahlEvents;

    public VeranstaltungsPlaner(int kapazitaet) {
        this.veranstaltungen = new Veranstaltung[kapazitaet];
        this.anzahlEvents = 0;
    }

    public void neuesEvent(Veranstaltung v) {
        if (anzahlEvents < veranstaltungen.length) {
            veranstaltungen[anzahlEvents] = v;
            anzahlEvents++;
        } else {
            System.out.println("Planer ist voll.");
        }
    }

    public void drucken() {
        // Hier könnte man vorher sortieren (Bubblesort etc. unter Nutzung von .vergleiche)
        for (int i = 0; i < anzahlEvents; i++) {
            System.out.println(veranstaltungen[i].toString());
        }
    }

    // Nur zum Testen (Main Methode)
    public static void main(String[] args) {
        VeranstaltungsPlaner planer = new VeranstaltungsPlaner(10);

        Datum d1 = new Datum(24, 12, 2025);
        Datum d2 = new Datum(1, 1, 2026);
        Zeit z1 = new Zeit(20, 0);

        planer.neuesEvent(new Messe("Tech-Expo", "Berlin", d2));
        planer.neuesEvent(new Konzert("Rock am Ring", "Nürburgring", new DatumZeit(d1, z1), Status.VERFUEGBAR));

        planer.drucken();
    }
}

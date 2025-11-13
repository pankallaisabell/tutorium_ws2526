package t131125;

// Test-Klasse
class AutoTestMitZaehler {
    public static void main(String[] args) {
        System.out.println("Anzahl Autos zu Beginn: " + Auto.getAnzahlAutos());

        Auto auto1 = new Auto("BMW", 2020);
        System.out.println("Nach Erstellen von auto1: " + Auto.getAnzahlAutos());

        Auto auto2 = new Auto("Mercedes", 2018);
        System.out.println("Nach Erstellen von auto2: " + Auto.getAnzahlAutos());

        Auto auto3 = new Auto("Dacia", 2022);
        System.out.println("Nach Erstellen von auto3: " + Auto.getAnzahlAutos());

        System.out.println("\nGesamtanzahl ersteller Autos: " + Auto.getAnzahlAutos());
    }
}

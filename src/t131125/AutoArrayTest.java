package t131125;

// Test-Klasse mit Array
public class AutoArrayTest {
    public static void main(String[] args) {
        // Array aus Auto- und Elektroauto-Objekten erstellen
        Auto[] fahrzeuge = new Auto[6];

        // Normale Autos
        fahrzeuge[0] = new Auto("BMW", 2020);
        fahrzeuge[1] = new Auto("Mercedes", 2019);
        fahrzeuge[2] = new Auto("Dacia", 2021);

        // Elektroautos
        fahrzeuge[3] = new Elektroauto("Tesla Model 3", 2022, 85);
        fahrzeuge[4] = new Elektroauto("VW ID.3", 2021, 60);
        fahrzeuge[5] = new Elektroauto("Porsche Taycan", 2023, 95);

        // Einige Fahrzeuge beschleunigen
        fahrzeuge[0].beschleunigen(80.0);
        fahrzeuge[2].beschleunigen(120.0);
        fahrzeuge[3].beschleunigen(150.0);
        fahrzeuge[5].beschleunigen(200.0);

        // Elektroauto laden
        if (fahrzeuge[4] instanceof Elektroauto) {
            ((Elektroauto) fahrzeuge[4]).laden(30);
        }

        // Alle Objekte ausgeben
        System.out.println("=== Fahrzeug-Übersicht ===\n");

        for (int i = 0; i < fahrzeuge.length; i++) {
            System.out.println("[" + (i+1) + "] " + fahrzeuge[i]);

            // Zeige an, welche toString-Methode verwendet wird
            if (fahrzeuge[i] instanceof Elektroauto) {
                System.out.println("    -> toString() von Elektroauto (ruft super.toString() auf)");
            } else {
                System.out.println("    -> toString() von Auto");
            }
            System.out.println();
        }

        System.out.println("=== Beobachtung ===");
        System.out.println("- Bei normalen Auto-Objekten wird Auto.toString() verwendet");
        System.out.println("- Bei Elektroauto-Objekten wird Elektroauto.toString() verwendet");
        System.out.println("- Elektroauto.toString() ruft intern super.toString() auf und");
        System.out.println("  fügt dann den Akkustand hinzu");
        System.out.println("- Dies ist ein Beispiel für POLYMORPHISMUS: Das Array ist vom Typ");
        System.out.println("  Auto[], enthält aber auch Elektroauto-Objekte. Java wählt zur");
        System.out.println("  Laufzeit automatisch die richtige toString()-Methode aus.");
    }
}

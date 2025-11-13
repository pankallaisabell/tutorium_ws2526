package t131125;

// Test-Klasse für equals
class AutoEqualsTest {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", 2020);
        Auto auto2 = new Auto("BMW", 2020);
        Auto auto3 = new Auto("BMW", 2021);
        Auto auto4 = new Auto("Mercedes", 2020);

        System.out.println("auto1: " + auto1);
        System.out.println("auto2: " + auto2);
        System.out.println("auto3: " + auto3);
        System.out.println("auto4: " + auto4);

        System.out.println("\n--- Vergleiche ---");

        System.out.println("auto1.equals(auto2): " + auto1.equals(auto2));
        System.out.println("Erklärung: Gleiche Marke (BMW) und gleiches Baujahr (2020)\n");

        System.out.println("auto1.equals(auto3): " + auto1.equals(auto3));
        System.out.println("Erklärung: Gleiche Marke (BMW), aber unterschiedliches Baujahr\n");

        System.out.println("auto1.equals(auto4): " + auto1.equals(auto4));
        System.out.println("Erklärung: Unterschiedliche Marken\n");

        System.out.println("auto1.equals(auto1): " + auto1.equals(auto1));
        System.out.println("Erklärung: Dasselbe Objekt\n");

        System.out.println("auto1.equals(null): " + auto1.equals(null));
        System.out.println("Erklärung: Vergleich mit null");

        // Teste mit verschiedenen Geschwindigkeiten
        auto1.beschleunigen(50);
        auto2.beschleunigen(100);
        System.out.println("\n--- Nach Beschleunigung ---");
        System.out.println("auto1: " + auto1);
        System.out.println("auto2: " + auto2);
        System.out.println("auto1.equals(auto2): " + auto1.equals(auto2));
        System.out.println("Erklärung: Immer noch gleich, da Geschwindigkeit nicht verglichen wird");
    }
}

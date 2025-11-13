package t131125;

class ElektroautoTest {
    public static void main(String[] args) {
        Elektroauto tesla = new Elektroauto("Tesla Model 3", 2021, 80);

        System.out.println("Initialer Zustand:");
        System.out.println(tesla);

        tesla.beschleunigen(100.0);
        System.out.println("\nNach Beschleunigung:");
        System.out.println(tesla);

        System.out.println("\nAkku laden...");
        tesla.laden(15);
        System.out.println(tesla);

        System.out.println("\nWeiteres Laden (über 100%)...");
        tesla.laden(20); // Sollte bei 100% stoppen
        System.out.println(tesla);

        tesla.bremsen(50.0);
        System.out.println("\nNach Bremsen:");
        System.out.println(tesla);
    }
}

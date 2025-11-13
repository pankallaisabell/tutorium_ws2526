package t131125;

public class ZahlenreiheAufgabe {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            // Prüfe zuerst, ob durch 3 UND 5 teilbar
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " - FooBar");
            }
            // Nur durch 3 teilbar
            else if (i % 3 == 0) {
                System.out.println(i + " - Foo");
            }
            // Nur durch 5 teilbar
            else if (i % 5 == 0) {
                System.out.println(i + " - Bar");
            }
            // Keine der Bedingungen trifft zu
            else {
                System.out.println(i);
            }
        }
    }
}

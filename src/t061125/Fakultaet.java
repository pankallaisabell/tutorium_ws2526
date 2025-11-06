package t061125;

import java.util.Scanner;

public class Fakultaet {

    // Iterative Methode
    public static long fakultaetIterativ(int n) {
        long ergebnis = 1;
        for (int i = 1; i <= n; i++) {
            ergebnis *= i;
            System.out.println("Schleifendurchlauf " + i + ": Zwischenstand = " + ergebnis);
        }
        return ergebnis;
    }

    // Rekursive Methode
    public static long fakultaetRekursiv(int n) {
        System.out.println("Berechne Fakultät von " + n + " ...");

        if (n <= 1) {
            System.out.println("Abbruchbedingung erreicht: " + n + "! = 1");
            return 1;
        }

        long ergebnis = n * fakultaetRekursiv(n - 1);
        System.out.println("Ergebnis für " + n + "! = " + ergebnis);
        return ergebnis;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Zahl für die Fakultätsberechnung ein: ");
        int n = scanner.nextInt();

        System.out.println("\n=== ITERATIVE BERECHNUNG ===");
        long ergIterativ = fakultaetIterativ(n);
        System.out.println("Endergebnis iterativ: " + n + "! = " + ergIterativ);

        System.out.println("\n=== REKURSIVE BERECHNUNG ===");
        long ergRekursiv = fakultaetRekursiv(n);
        System.out.println("Endergebnis rekursiv: " + n + "! = " + ergRekursiv);

        scanner.close();
    }
}

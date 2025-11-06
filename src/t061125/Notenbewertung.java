package t061125;

import java.util.Scanner;

public class Notenbewertung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Note (1-5) ein: ");
        int note = scanner.nextInt();

        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Nicht bestanden");
                break;
            default:
                System.out.println("Ungültige Note!");
        }
        scanner.close();
    }
}

package t061125;

import java.util.Scanner;

public class KommaNoten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib eine Note ein (z.B. 1,3, 2,7): ");
        double note = scanner.nextDouble();

        // Umwandlung in Integer für switch (1,0 -> 10, 1,3 -> 13, etc.)
        int noteInt = (int)(note * 10);

        switch (noteInt) {
            case 10:
            case 13:
                System.out.println("Sehr gut");
                break;
            case 17:
            case 20:
            case 23:
                System.out.println("Gut");
                break;
            case 27:
            case 30:
            case 33:
                System.out.println("Befriedigend");
                break;
            case 37:
            case 40:
                System.out.println("Ausreichend");
                break;
            case 50:
                System.out.println("Nicht bestanden");
                break;
            default:
                System.out.println("Ungültige Note!");
        }
        scanner.close();
    }
}

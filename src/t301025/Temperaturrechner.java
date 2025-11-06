package t301025;

import java.util.Scanner;

public class Temperaturrechner {
    /*
    public static void main(String[] args) {
        double celsius = 20.0;
        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.println(celsius + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit.");
    }
    */

    // Version mit Scanner:

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("gib eine Temperatur in Grad Celsius ein: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9.0 / 5.0 + 32.0;

        System.out.println(celsius + " Grad Celsius sind " + fahrenheit + " Grad Fahrenheit.");

        scanner.close();
    }

}

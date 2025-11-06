package t301025;

public class Rabattrechner {
    public static void main(String[] args) {
        double preis = 72.50;

        // Ternärer Operator: Bedingung ? wenn-true : wenn-false
        // vergleiche: if-Operator
        double endpreis = (preis >= 50.0) ? preis * 0.9 : preis;

        System.out.printf("Originalpreis: %.2f €%n", preis);
        System.out.printf("Rabattierter Preis: %.2f €%n", endpreis);
    }
}

package t041225;

import java.util.Arrays;

public class BoomPartyAufgaben {

    public static void main(String[] args) {
        System.out.println("=== Aufgabe 1: Zahlen-Streams ===");
        aufgabe1();

        System.out.println("\n=== Aufgabe 2: DJ-Playlist ===");
        aufgabe2();

        System.out.println("\n=== Aufgabe 3: Preise analysieren ===");
        aufgabe3();

        System.out.println("\n=== Aufgabe 4: Prof-Bar ===");
        aufgabe4();
    }

    // Aufgabe 1: Zahlen-Streams für die Boom-Party
    public static void aufgabe1() {
        // Array mit Besucher-Nummern 1 bis 1000 erstellen
        int[] besucher = new int[1000];
        for (int i = 0; i < besucher.length; i++) {
            besucher[i] = i + 1;
        }

        // 1. Alle Besucher mit gerader Nummer ausgeben
        System.out.println("1. Gerade Nummern:");
        Arrays.stream(besucher)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("\n");

        // 2. Anzahl der Besucher, deren Nummer durch 7 teilbar ist
        long anzahlDurch7 = Arrays.stream(besucher)
                .filter(n -> n % 7 == 0)
                .count();
        System.out.println("2. Anzahl durch 7 teilbar: " + anzahlDurch7);

        // 3. Summe aller Besucher-Nummern
        int summe = Arrays.stream(besucher)
                .sum();
        System.out.println("3. Summe aller Nummern: " + summe);
    }

    // Aufgabe 2: DJ-Playlist als Array streamen
    public static void aufgabe2() {
        String[] playlist = {
                "Mr. Brightside", "Zukunft Pink", "Party Sahne",
                "Wonderwall", "Major Tom", "Big City Life"
        };

        // 1. Alle Titel mit Buchstaben "o" ausgeben
        System.out.println("1. Titel mit 'o':");
        Arrays.stream(playlist)
                .filter(s -> s.contains("o"))
                .forEach(s -> System.out.println(s));

        System.out.println();

        // 2. Länge jedes Titels ohne Leerzeichen
        System.out.println("2. Länge ohne Leerzeichen:");
        Arrays.stream(playlist)
                .forEach(s -> {
                    int laenge = s.replace(" ", "").length();
                    System.out.println(s + " -> " + laenge);
                });

        System.out.println();

        // 3. Prüfen, ob ein Song länger als 20 Zeichen ist
        boolean hatLangenSong = Arrays.stream(playlist)
                .anyMatch(s -> s.length() > 20);
        System.out.println("3. Song länger als 20 Zeichen? " + hatLangenSong);
    }

    // Aufgabe 3: Preise der Boom-Party analysieren
    public static void aufgabe3() {
        double[] prices = {3.5, 4.0, 7.5, 2.0, 9.0, 3.0};

        // 1. Alle Preise unter 5 € ausgeben
        System.out.println("1. Preise unter 5€:");
        Arrays.stream(prices)
                .filter(p -> p < 5.0)
                .forEach(p -> System.out.println(p + "Euro"));

        System.out.println();

        // 2. Gesamtumsatz
        double gesamtumsatz = Arrays.stream(prices)
                .sum();
        System.out.println("2. Gesamtumsatz: " + gesamtumsatz + "Euro");

        // 3. Höchster und niedrigster Preis
        double hoechster = Arrays.stream(prices)
                .max()
                .getAsDouble();
        double niedrigster = Arrays.stream(prices)
                .min()
                .getAsDouble();
        System.out.println("3. Höchster Preis: " + hoechster + "Euro");
        System.out.println("   Niedrigster Preis: " + niedrigster + "Euro");

        // 4. Alle Preise um 10% teurer
        System.out.println("4. Preise +10%:");
        Arrays.stream(prices)
                .map(p -> p * 1.1)
                .forEach(p -> System.out.println(p + "Euro"));

        System.out.println();

        // 5. Preis über 10€?
        boolean ueberZehn = Arrays.stream(prices)
                .anyMatch(p -> p > 10.0);
        System.out.println("5. Preis über 10Euro? " + ueberZehn);
    }

    // Aufgabe 4: Die Prof-Bar bestellt Nachschub
    public static void aufgabe4() {
        String[] profBarDrinks = {
                "Old Fashioned", "Negroni", "Mojito",
                "Espresso Martini", "Amaretto Sour", "Gin Fizz"
        };

        // 1. Drinks mit Leerzeichen
        System.out.println("1. Drinks mit Leerzeichen:");
        Arrays.stream(profBarDrinks)
                .filter(d -> d.contains(" "))
                .forEach(d -> System.out.println(d));

        System.out.println();

        // 2. Länge jedes Namens
        System.out.println("2. Länge der Namen:");
        Arrays.stream(profBarDrinks)
                .forEach(d -> System.out.println(d + " → " + d.length()));

        System.out.println();

        // 3. Alphabetisch sortiertes Array
        System.out.println("3. Alphabetisch sortiert:");
        String[] sortiert = Arrays.stream(profBarDrinks)
                .sorted()
                .toArray(String[]::new);
        Arrays.stream(sortiert)
                .forEach(d -> System.out.println(d));

        System.out.println();

        // 4. Beginnt mindestens ein Drink mit 'M'?
        boolean beginntMitM = Arrays.stream(profBarDrinks)
                .anyMatch(d -> d.startsWith("M"));
        System.out.println("4. Drink beginnt mit 'M'? " + beginntMitM);

        // 5. Bar-Kürzel (erste 3 Buchstaben in Großbuchstaben)
        System.out.println("5. Bar-Kürzel:");
        Arrays.stream(profBarDrinks)
                .map(d -> d.substring(0, 3).toUpperCase())
                .forEach(k -> System.out.println(k));
    }
}
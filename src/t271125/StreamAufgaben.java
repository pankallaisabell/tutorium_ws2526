package t271125;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAufgaben {

    public static void main(String[] args) {
        System.out.println("=== Aufgabe 1 ===");
        aufgabe1();

        System.out.println("\n=== Aufgabe 2 ===");
        aufgabe2();

        System.out.println("\n=== Aufgabe 3 ===");
        aufgabe3();

        System.out.println("\n=== Aufgabe 4 ===");
        aufgabe4();

        System.out.println("\n=== Aufgabe 5 ===");
        aufgabe5();
    }

    // Aufgabe 1: Wünsche filtern und ausgeben
    public static void aufgabe1() {
        List<String> wuensche = List.of(
                "Schlitten",
                "Puppe",
                "Schokolade",
                "Snowboard",
                "Playmobil"
        );

        wuensche.stream()
                .filter(w -> w.startsWith("S"))         // nimm w aus dem Stream und behalte nur Wörter mit S
                .map(w -> w.toUpperCase())              // Großbuchstaben   // = String::toUpperCase
                .forEach(w -> System.out.println(w));   // ausgeben         // = .forEach(System.out::println);
    }

    // Aufgabe 2: Geschenke filtern und sortieren
    public static void aufgabe2() {
        List<Geschenk> band = List.of(
                new Geschenk("Buch", 500),
                new Geschenk("Auto-Spielzeug", 300),
                new Geschenk("Schokolade", 120),
                new Geschenk("Lego-Set", 900)
        );

        band.stream()
                .filter(g -> g.getGewicht() < 500)
                .sorted(Comparator.comparingInt(Geschenk::getGewicht))  // = .sorted(Comparator.comparingInt(g -> g.getGewicht()))
                .forEach(g -> System.out.println(g));
    }

    // Aufgabe 3: Verschachtelte Objekte
    public static void aufgabe3() {
        List<Palette> lager = List.of(
                new Palette("A1", new Geschenk("Roboter", 800)),
                new Palette("A2", new Geschenk("Schokolade", 120)),
                new Palette("B1", new Geschenk("Rodelwandelt eine Collection in einen Stream um", 1100)),
                new Palette("C3", new Geschenk("Puzzle", 300))
        );

        // 1. Filtere alle Geschenke, die unter 500g wiegen
        // 2. Sortiere die gefilterten Geschenke nach Gewicht
        // 3. Gib sie aus
        lager.stream()
                .map(p -> p.getGeschenk())
                .filter(g -> g.getGewicht() < 500)
                .sorted(Comparator.comparingInt(Geschenk::getGewicht))
                .forEach(g -> System.out.println(g));

        /* Alternative:
        lager.stream()
            .filter(p -> p.getGeschenk().getGewicht() < 500)  // Filter auf Palette-Ebene
            .map(Palette::getGeschenk)                        // Geschenk extrahieren
            .sorted(Comparator.comparingInt(Geschenk::getGewicht))
            .forEach(System.out::println);
        */
    }

    // Aufgabe 4: collect() anwenden
    public static void aufgabe4() {
        List<Palette> lager = List.of(
                new Palette("A1", new Geschenk("Roboter", 800)),
                new Palette("A2", new Geschenk("Schokolade", 120)),
                new Palette("B1", new Geschenk("Rodel", 1100)),
                new Palette("C3", new Geschenk("Puzzle", 300))
        );

        List<String> geschenkNamen = lager.stream() // wandelt eine Collection in einen Stream um
                .map(Palette::getGeschenk)      // = p -> p.getGeschenk()
                .filter(g -> g.getGewicht() < 400)
                .map(Geschenk::getName)         // = g -> g.getName()
                .collect(Collectors.toList());

        System.out.println(geschenkNamen);
    }

    // Aufgabe 5: Imperatives Äquivalent
    public static void aufgabe5() {
        var arr = new String[]{"Chris", "Alex", "Mike"};

        System.out.println("Stream-Version:");
        Arrays.stream(arr)
                .map(item -> item.toLowerCase())
                .filter(item -> item.contains("i"))
                .map(item -> item + "" + item.length())
                .forEach(item -> System.out.println(item));

        System.out.println("\nImperative Version:");
        // Imperatives Äquivalent ohne Streams
        List<String> lower = new ArrayList<>();
        for (String item : arr) {
            lower.add(item.toLowerCase());
        }

        List<String> withI = new ArrayList<>();
        for (String item : lower) {
            if (item.contains("i")) {
                withI.add(item);
            }
        }

        for (String item : withI) {
            System.out.println(item + item.length());
        }

        /* Alternative
        for (int i = 0; i < arr.length; i++) {
            String item = arr[i];

            // map: toLowerCase()
            item = item.toLowerCase();

            // filter: contains("i")
            if (item.contains("i")) {
                // map: item + length
                item = item + item.length();

                // forEach: ausgeben
                System.out.println(item);
            }
        }
        */
    }
}
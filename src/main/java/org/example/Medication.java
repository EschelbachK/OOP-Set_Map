package org.example;

// Klasse für ein Medikament mit Name, Preis und Verfügbarkeit
public class Medication {
    private String name;
    private double price;
    private boolean availability;

    // Konstruktor: Erstellt ein neues Medikament
    public Medication(String name, double price, boolean availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    // Gibt den Namen zurück
    public String getName() {
        return name;
    }

    // Gibt den Preis zurück
    public double getPrice() {
        return price;
    }

    // Gibt zurück, ob das Medikament verfügbar ist
    public boolean getAvailability() {
        return availability;
    }

    // Überschreibt toString(), um Medikamentendaten schön auszugeben
    @Override
    public String toString() {
        return "Name: " + name + ", Preis: " + price + "€, Verfügbar: " + (availability ? "Ja" : "Nein");
    }
}

package org.example;

// Hauptklasse zur Demonstration der Apotheke
public class Main {
    public static void main(String[] args) {
        // Erstellt eine neue Apotheke
        Pharmacy pharmacy = new Pharmacy();

        // Erstellt einige Medikamente
        Medication ibuprofen = new Medication("Ibuprofen", 4.99, true);
        Medication paracetamol = new Medication("Paracetamol", 3.49, true);
        Medication aspirin = new Medication("Aspirin", 5.99, false);

        // Fügt die Medikamente in die Apotheke ein
        pharmacy.save(ibuprofen);
        pharmacy.save(paracetamol);
        pharmacy.save(aspirin);

        // Gibt alle gespeicherten Medikamente aus
        System.out.println("Alle Medikamente:");
        pharmacy.printAllMedications();

        // Sucht nach einem bestimmten Medikament
        System.out.println("\nMedikament finden: Paracetamol");
        Medication found = pharmacy.find("Paracetamol");
        System.out.println(found != null ? found : "Nicht gefunden");

        // Löscht ein Medikament
        System.out.println("\nParacetamol löschen...");
        pharmacy.delete("Paracetamol");

        // Gibt die Anzahl der verbleibenden Medikamente aus
        System.out.println("\nAnzahl Medikamente: " + pharmacy.getCount());

        // Gibt die restlichen Medikamente aus
        System.out.println("Alle Medikamente nach Löschung:");
        pharmacy.printAllMedications();
    }
}

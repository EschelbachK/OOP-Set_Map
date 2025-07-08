package org.example;

import java.util.HashMap;
import java.util.Map;

// Klasse für die Apotheke, die Medikamente verwaltet
public class Pharmacy {
    // Map zur Speicherung der Medikamente: Name als Schlüssel, Medikament als Wert
    private Map<String, Medication> medications;

    // Konstruktor: Erstellt eine neue, leere Map
    public Pharmacy() {
        medications = new HashMap<>();
    }

    // Gibt die Anzahl der gespeicherten Medikamente zurück
    public int getCount() {
        return medications.size();
    }

    // Fügt ein Medikament zur Map hinzu (überschreibt, falls Name schon existiert)
    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    // Sucht ein Medikament nach Namen und gibt es zurück (oder null, falls nicht gefunden)
    public Medication find(String medicationName) {
        return medications.getOrDefault(medicationName, null);
    }

    // Entfernt ein Medikament aus der Map, basierend auf dem Namen
    public void delete(String medicationName) {
        medications.remove(medicationName);
    }

    // Gibt alle Medikamente mit ihren Details aus
    public void printAllMedications() {
        // Prüft, ob die Apotheke leer ist
        if (medications.isEmpty()) {
            System.out.println("Keine Medikamente in der Apotheke.");
            return;
        }

        // Geht alle Werte (Medikamente) in der Map durch und gibt sie aus
        for (Medication med : medications.values()) {
            System.out.println(med);
        }
    }
}

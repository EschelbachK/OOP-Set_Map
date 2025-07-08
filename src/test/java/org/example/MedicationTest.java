package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicationTest {

    @Test
    void getName_shouldReturnCorrectName() {
        // Medikament anlegen
        Medication med = new Medication("Aspirin", 9.99, true);

        // Name prüfen
        assertEquals("Aspirin", med.getName());
    }

    @Test
    void getPrice_shouldReturnCorrectPrice() {
        // Medikament anlegen
        Medication med = new Medication("Aspirin", 9.99, true);

        // Preis prüfen
        assertEquals(9.99, med.getPrice());
    }

    @Test
    void getAvailability_shouldReturnCorrectAvailability() {
        // Medikament verfügbar
        Medication medAvailable = new Medication("Aspirin", 9.99, true);
        assertTrue(medAvailable.getAvailability());

        // Medikament nicht verfügbar
        Medication medUnavailable = new Medication("Paracetamol", 5.49, false);
        assertFalse(medUnavailable.getAvailability());
    }

    @Test
    void toString_shouldContainAllInfo() {
        // Medikament anlegen
        Medication med = new Medication("Aspirin", 9.99, true);

        // Ausgabe erzeugen
        String output = med.toString();

        // Prüfen, ob Name, Preis und Verfügbarkeit drin sind
        assertTrue(output.contains("Aspirin"));
        assertTrue(output.contains("9.99"));
        assertTrue(output.contains("Ja"));
    }
}

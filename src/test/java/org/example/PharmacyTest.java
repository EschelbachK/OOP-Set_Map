package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PharmacyTest {

    private Pharmacy pharmacy;
    private Medication med1;
    private Medication med2;

    @BeforeEach
    void setUp() {
        // Neue Apotheke und Beispielmedikamente anlegen
        pharmacy = new Pharmacy();
        med1 = new Medication("Aspirin", 9.99, true);
        med2 = new Medication("Paracetamol", 5.49, false);
    }

    @Test
    void getCount_shouldReturnZeroInitially() {
        // Anfangszustand: Apotheke leer
        assertEquals(0, pharmacy.getCount());
    }

    @Test
    void save_shouldAddMedication() {
        // Medikament speichern und Anzahl prüfen
        pharmacy.save(med1);
        assertEquals(1, pharmacy.getCount());
        assertEquals(med1, pharmacy.find("Aspirin"));
    }

    @Test
    void find_shouldReturnMedicationIfExists() {
        // Medikament speichern und finden
        pharmacy.save(med2);
        Medication found = pharmacy.find("Paracetamol");
        assertNotNull(found);
        assertEquals("Paracetamol", found.getName());
    }

    @Test
    void find_shouldReturnNullIfNotFound() {
        // Suchen nach nicht vorhandenem Medikament
        assertNull(pharmacy.find("Ibuprofen"));
    }

    @Test
    void delete_shouldRemoveMedication() {
        // Medikament speichern, löschen und prüfen
        pharmacy.save(med1);
        pharmacy.delete("Aspirin");
        assertEquals(0, pharmacy.getCount());
        assertNull(pharmacy.find("Aspirin"));
    }

    @Test
    void delete_shouldDoNothingIfNotFound() {
        // Löschen eines nicht vorhandenen Medikaments sollte keinen Fehler verursachen
        pharmacy.delete("NichtVorhanden");
        assertEquals(0, pharmacy.getCount());
    }
}

package co.edu.uniquindio.poo.tarea.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class TarifaVisitanteTest {

    @Test
    void calcularCostoAplicaCobroMinimo() {
        TarifaVisitante tarifa = new TarifaVisitante(8000, 16000);
        assertEquals(16000, tarifa.calcularCosto(1)); // 8000 < 16000, cobra el mínimo
    }
  
}
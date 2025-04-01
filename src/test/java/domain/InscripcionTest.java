package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test
    @DisplayName("Test para saber si funciona el sistema de inscripción")
    public void puedeInscribirse() {

        // Instancio la materia pdp
        Materia pdp = new Materia("pdp");
        Materia ayed = new Materia("ayed");
        Set<Materia> correlativasDePdp = new HashSet<>();
        correlativasDePdp.add(ayed);
        pdp.setCorrelativas(correlativasDePdp);

        // Instancio el alumno y sus materias aprobadas
        Alumno alumno = new Alumno("lucas");
        Set<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(ayed);
        alumno.setMateriasAprobadas(materiasAprobadas);

        // Instancio la inscripción
        Inscripcion inscripcion = new Inscripcion(alumno);
        Set<Materia> materiasInscripcion = new HashSet<>();
        materiasInscripcion.add(pdp);
        inscripcion.setMaterias(materiasInscripcion);

        Assertions.assertTrue(inscripcion.aprobada());
    }
}
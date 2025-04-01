package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Materia {
    private String nombre;
    private Set<Materia> correlativas;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public boolean alumnoCumpleCorrelativas(Alumno alumno) {
        // Verificamos si todas las correlativas están aprobadas por el alumno
        return this.correlativas
                .stream()
                .allMatch(materia -> alumno.aprobo(materia));
    }
}

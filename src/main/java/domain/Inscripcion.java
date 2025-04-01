package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Inscripcion {
    private Alumno alumno;
    private Set<Materia> materias;

    public boolean aprobada() {
        return this.materias
                .stream()
                .allMatch(materia ->
                        materia.alumnoCumpleCorrelativas(alumno)
                );
    }

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
    }
}

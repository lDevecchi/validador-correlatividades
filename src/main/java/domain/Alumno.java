package domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
public class Alumno {
    private String nombre;
    private Set<Materia> materiasAprobadas;

    public boolean aprobo(Materia materia) {
        return this.materiasAprobadas.stream().anyMatch(materia::equals);
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

}

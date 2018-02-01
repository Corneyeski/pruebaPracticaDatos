package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Cursos {
    private int idCurso;
    private String nombreCurso;

    @Id
    @Column(name = "id_curso")
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Basic
    @Column(name = "nombre_curso")
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cursos cursos = (Cursos) o;
        return idCurso == cursos.idCurso &&
                Objects.equals(nombreCurso, cursos.nombreCurso);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCurso, nombreCurso);
    }
}

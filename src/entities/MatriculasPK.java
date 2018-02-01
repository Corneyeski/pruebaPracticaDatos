package entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class MatriculasPK implements Serializable {
    private int idAlumno;
    private int idCurso;

    @Column(name = "id_alumno")
    @Id
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Column(name = "id_curso")
    @Id
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MatriculasPK that = (MatriculasPK) o;
        return idAlumno == that.idAlumno &&
                idCurso == that.idCurso;
    }

    @Override
    public int hashCode() {

        return Objects.hash(idAlumno, idCurso);
    }
}

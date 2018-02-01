package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@IdClass(MatriculasPK.class)
public class Matriculas {
    private long idMatricula;
    private int idAlumno;
    private int idCurso;
    private Date fechaInicio;

    @Basic
    @Column(name = "id_matricula")
    public long getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(long idMatricula) {
        this.idMatricula = idMatricula;
    }

    @Id
    @Column(name = "id_alumno")
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Id
    @Column(name = "id_curso")
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Basic
    @Column(name = "fecha_inicio")
    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matriculas that = (Matriculas) o;
        return idMatricula == that.idMatricula &&
                idAlumno == that.idAlumno &&
                idCurso == that.idCurso &&
                Objects.equals(fechaInicio, that.fechaInicio);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idMatricula, idAlumno, idCurso, fechaInicio);
    }
}

package entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Alumnos {
    private int idAlumno;
    private String nombreAlumno;

    @Id
    @Column(name = "id_alumno")
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Basic
    @Column(name = "nombre_alumno")
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return idAlumno == alumnos.idAlumno &&
                Objects.equals(nombreAlumno, alumnos.nombreAlumno);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idAlumno, nombreAlumno);
    }
}

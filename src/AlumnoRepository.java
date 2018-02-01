import entities.Alumnos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface AlumnoRepository extends JpaRepository<Alumnos, Long> {

    public Collection<Alumnos> cargarAlumnos();
    public Alumnos getAlumno(int idAlumno);
}

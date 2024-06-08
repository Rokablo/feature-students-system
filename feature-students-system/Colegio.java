package colegio;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Colegio {
    public static void main(String[] args) {
        // Crear el gestor académico
        GestorAcademico gestor = new GestorAcademico();

        // Formateador para la fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            // Crear estudiantes
            estudiante estudiante1 = new estudiante(1, "Juan", "Pérez", dateFormat.parse("2000-01-15"), "matriculado");
            estudiante estudiante2 = new estudiante(2, "María", "Gómez", dateFormat.parse("1999-05-20"), "matriculado");
            estudiante estudiante3 = new estudiante(3, "Carlos", "López", dateFormat.parse("2001-08-30"), "inactivo");

            // Agregar estudiantes al gestor académico
            gestor.agregarEstudiante(estudiante1);
            gestor.agregarEstudiante(estudiante2);
            gestor.agregarEstudiante(estudiante3);

            // Crear cursos
            Curso curso1 = new Curso(101, "Matemáticas", "Curso de matemáticas básicas", 3, "1.0");
            Curso curso2 = new Curso(102, "Historia", "Curso de historia mundial", 4, "1.0");

            // Agregar cursos al gestor académico
            gestor.agregarCurso(curso1);
            gestor.agregarCurso(curso2);

            // Inscribir estudiantes en los cursos
            gestor.inscribirEstudianteEnCurso(estudiante1, curso1);
            gestor.inscribirEstudianteEnCurso(estudiante2, curso1);
            gestor.inscribirEstudianteEnCurso(estudiante2, curso2);
            gestor.inscribirEstudianteEnCurso(estudiante3, curso2);

            // Mostrar inscripciones
            gestor.mostrarInscripciones();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}

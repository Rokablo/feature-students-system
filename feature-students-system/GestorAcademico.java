
package colegio;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    private ArrayList<estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Curso, ArrayList<estudiante>> inscripciones;

    public GestorAcademico() {
        estudiantes = new ArrayList<>();
        cursos = new ArrayList<>();
        inscripciones = new HashMap<>();
    }

    // Métodos para gestionar estudiantes
    public void agregarEstudiante(estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    // Métodos para gestionar cursos
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public ArrayList<Curso> obtenerCursos() {
        return cursos;
    }

    // Métodos para gestionar inscripciones
    public void inscribirEstudianteEnCurso(estudiante estudiante, Curso curso) {
        inscripciones.computeIfAbsent(curso, k -> new ArrayList<>()).add(estudiante);
    }

    public ArrayList<estudiante> obtenerEstudiantesInscritos(Curso curso) {
        return inscripciones.getOrDefault(curso, new ArrayList<>());
    }

    // Método para mostrar todas las inscripciones
    public void mostrarInscripciones() {
        for (Curso curso : inscripciones.keySet()) {
            System.out.println("Curso: " + curso.getNombre());
            for (estudiante estudiante : inscripciones.get(curso)) {
                System.out.println("  Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
            }
        }
    }

    @Override
    public String toString() {
        return "GestorAcademico{" +
                "estudiantes=" + estudiantes +
                ", cursos=" + cursos +
                ", inscripciones=" + inscripciones +
                '}';
    }
}


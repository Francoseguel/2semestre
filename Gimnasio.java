
package gimnasio.duoc;

import java.util.Scanner;
import java.util.ArrayList;


public class Gimnasio {
    private ArrayList<Alumno> alumnos;
    private Scanner scanner;

    public Gimnasio() {
        alumnos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void agregarAlumno() {
        System.out.print("Ingrese ID del alumno: ");
        String id = scanner.nextLine();
        System.out.print("Ingrese nombre completo: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese tipo de membresía (Mensual, Trimestral, Anual): ");
        String membresia = scanner.nextLine();

        Alumno alumno = new Alumno(id, nombre, edad, membresia);
        alumnos.add(alumno);
        System.out.println("Alumno agregado con éxito.");
    }

    public void mostrarAlumnos() {
        if (alumnos.isEmpty()) {
            System.out.println("La lista de alumnos está vacía.");
        } else {
            for (Alumno alumno : alumnos) {
                System.out.println(alumno);
            }
        }
    }

    public void actualizarAlumno() {
        System.out.print("Ingrese ID del alumno que desea actualizar: ");
        String id = scanner.nextLine();
        Alumno alumnoEncontrado = null;

        for (Alumno alumno : alumnos) {
            if (alumno.getId().equals(id)) {
                alumnoEncontrado = alumno;
                break;
            }
        }

        if (alumnoEncontrado != null) {
            System.out.print("Ingrese nuevo nombre: ");
            alumnoEncontrado.setNombre(scanner.nextLine());
            System.out.print("Ingrese nueva edad: ");
            alumnoEncontrado.setEdad(Integer.parseInt(scanner.nextLine()));
            System.out.print("Ingrese nuevo tipo de membresía: ");
            alumnoEncontrado.setMembresia(scanner.nextLine());
            System.out.println("Alumno actualizado con éxito.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }

    public void eliminarAlumno() {
        System.out.print("Ingrese ID del alumno que desea eliminar: ");
        String id = scanner.nextLine();
        Alumno alumnoAEliminar = null;

        for (Alumno alumno : alumnos) {
            if (alumno.getId().equals(id)) {
                alumnoAEliminar = alumno;
                break;
            }
        }

        if (alumnoAEliminar != null) {
            alumnos.remove(alumnoAEliminar);
            System.out.println("Alumno eliminado con éxito.");
        } else {
            System.out.println("Alumno no encontrado.");
        }
    }
}
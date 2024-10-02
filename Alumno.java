
package gimnasio.duoc;

public class Alumno {
    private String id;
    private String nombre;
    private int edad;
    private String membresia;

    public Alumno(String id, String nombre, int edad, String membresia) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.membresia = membresia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", membresia=" + membresia + '}';
    }
    
    
    
}

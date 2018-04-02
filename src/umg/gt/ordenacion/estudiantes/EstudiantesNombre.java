package umg.gt.ordenacion.estudiantes;

public class EstudiantesNombre implements Comparable<EstudiantesNombre> {

    private String carne;
    private String nombre;
    private String apellido;
    private String carrera;
    public EstudiantesNombre(String carne, String nombre, String apellido,String carrera) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera=carrera;
    }

    public EstudiantesNombre() {
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return carne + " " + nombre + " " + apellido+" "+carrera+"\n";
    }

    @Override
    public int compareTo(EstudiantesNombre e) {
        return this.getNombre().compareTo(e.getNombre());
    }
    
}

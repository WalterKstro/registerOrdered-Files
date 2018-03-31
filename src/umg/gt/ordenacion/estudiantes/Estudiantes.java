package umg.gt.ordenacion.estudiantes;

public class Estudiantes implements Comparable<Estudiantes> {

    private String carne;
    private String nombre;
    private String apellido;

    public Estudiantes(String carne, String nombre, String apellido) {
        this.carne = carne;
        this.nombre = nombre;
        this.apellido = apellido;
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
        return carne + " " + nombre + " " + apellido+"\n";
    }

    @Override
    public int compareTo(Estudiantes e) {
        return this.getCarne().compareTo(e.getCarne());
    }
}

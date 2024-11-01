package seleccion;

public class persona implements Comparable<persona>{
    private String nombre;
    private int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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



    @Override
    public int compareTo(persona otraPersona) {
        return this.nombre.compareTo(otraPersona.getNombre());
    }
    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}


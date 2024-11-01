package busqueda_bi;

public class metodos {
    private String nombre;
    private double precio;

    public metodos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "metodos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

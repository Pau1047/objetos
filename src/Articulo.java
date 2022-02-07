public class Articulo {

    private String id;
    public String getId() {
        return id;
    }

    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String descripcion;
    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    private double precio;
    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Articulo(String id){
        this.id = id;
    }

    private double peso;
    public double getPeso(){
        return peso;
    }
}

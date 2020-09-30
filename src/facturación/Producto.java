package facturación;

public class Producto {
    private String Nombre_producto;
    private int id_producto;
    private float precio;
    private float cantidad;

    public Producto(String Nombre_producto, int id_producto, float precio,float cantidad) {
        this.Nombre_producto = Nombre_producto;
        this.id_producto = id_producto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre_producto() {
        return Nombre_producto;
    }

    public void setNombre_producto(String Nombre_producto) {
        this.Nombre_producto = Nombre_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }
}

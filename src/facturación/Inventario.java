
package facturación;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> Productos = new ArrayList<Producto>();

    public Producto getProducto(int id_producto) {
        Producto producto = null;
        for (Producto Producto1 : this.Productos) {
            if(Producto1.getId_producto()==id_producto){
                producto=Producto1;
            }
        }
        return producto;
    }
     public ArrayList<Producto> getProductos() {
        return this.Productos;
     }
    public void addProducto(Producto producto) {
        this.Productos.add(producto);
    }
    public void setProducto(Producto producto) {
        boolean sw=true;
        for (Producto Producto1 : this.Productos) {
            if(Producto1.getId_producto()==producto.getId_producto()){
                Producto1=producto;
                sw=false;
            }
        }
        if (sw) {
            this.addProducto(producto);
        }
    }

    public void setProductos(ArrayList<Producto> Productos) {
        this.Productos = Productos;
    }
}

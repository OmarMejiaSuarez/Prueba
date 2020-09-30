/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturación;

import java.util.ArrayList;

public class Carrito {
    private Cliente cliente;
    private ArrayList<Producto> Productos = new ArrayList<>();

    public Carrito() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return Productos;
    }

    public void addProducto(Producto producto) {
        this.Productos.add(producto);
    }

    public boolean vacio() {
        boolean sw=false;
        if (this.Productos==null) {
            sw=true;
        }
        return sw;
    }

    public void vaciar() {
        ArrayList<Producto> Producto = new ArrayList<>();
        this.Productos=Producto;
    }

    void setProductos(ArrayList<Producto> Producto) {
         this.Productos=Producto;
    }

}
    


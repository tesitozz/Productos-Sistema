package com.sistema.crud.servicio;

import com.sistema.crud.entidad.Producto;

import java.util.List;

public interface ProductoServicio {

    public List<Producto> listarTodosLosProductos();

    public Producto guardarProducto(Producto producto);

    public Producto obtenerProductoPorId(Long id);

    public Producto actualizarProducto(Producto producto);

    public  void eliminarProducto(Long id);
}

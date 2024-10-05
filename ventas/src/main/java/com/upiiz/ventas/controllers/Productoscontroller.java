package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class Productoscontroller {

    //GET - VER TODAS
    @GetMapping
    public String listarProductos(){
        return "Muestra todos los productos con GET ";
    }

    //GET con ID - VER con ID
    @GetMapping("/{id}")
    public String listarProducto(@PathVariable int id){
        return "Muestra un producto por ID con GET";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarProducto(@RequestBody String producto){
        return "Agregar producto por post" + producto;
    }

    //PUT - EDITAR
    @PutMapping("/{id}")
    public String editarProducto(@PathVariable int id, @RequestBody String producto){
        return "edita una producto con id por put" + producto + "con id" + id;
    }

    //DELETE - ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id) {
        return "Eliminar producto por delete" + id;
    }

}

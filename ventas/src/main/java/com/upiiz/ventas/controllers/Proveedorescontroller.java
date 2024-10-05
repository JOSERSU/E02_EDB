package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/proveedores")
public class Proveedorescontroller {

    //GET - VER TODAS
    @GetMapping
    public String listarProveedores(){
        return "Muestra todos los proveedores con GET ";
    }

    //GET con ID - VER con ID
    @GetMapping("/{id}")
    public String listarProveedor(@PathVariable int id){
        return "Muestra un proveedor por ID con GET";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarProveedor(@RequestBody String proveedor){
        return "Agregar proveedor por post" + proveedor;
    }

    //PUT - EDITAR
    @PutMapping("/{id}")
    public String editarProveedor(@PathVariable int id, @RequestBody String proveedor){
        return "edita una proveedor con id por put" + proveedor + "con id" + id;
    }

    //DELETE - ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable int id) {
        return "Eliminar proveedor por delete" + id;
    }

}

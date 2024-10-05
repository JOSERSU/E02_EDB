package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")

public class CategoriasController {

    //GET - VER TODAS
    @GetMapping
    public String listarCategorias(){
        return "Listado de todas las categorias con el metogo GET";
    }

    //GET con ID - VER con ID
    @GetMapping("/{id}")
    public String listarCategoria(@PathVariable int id){
        return "Obtner una categoria por id por metodod get";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria){
        return "Agregar categopria por post" + categoria;
    }

    //PUT - EDITAR
    @PutMapping("/{id}")
    public String editarCategoria(@PathVariable int id, @RequestBody String categoria){
        return "edita una categoria con id por put" + categoria + "con id" + id;
    }

    //DELETE - ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id){
        return "Eliminar categoria por delete"+id;
    }

}

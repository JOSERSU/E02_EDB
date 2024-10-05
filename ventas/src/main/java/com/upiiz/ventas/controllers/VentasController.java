package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ventas")
public class VentasController {

    //GET - VER TODAS
    @GetMapping
    public String listarVentas(){
        return "Muestra todas las ventas con GET ";
    }

    //GET con ID - VER con ID
    @GetMapping("/{id}")
    public String listarVentas(@PathVariable int id){
        return "Muestra una venta por ID con GET";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarVenta(@RequestBody String venta){
        return "Agregar venta por post" + venta;
    }

    //PUT - EDITAR
    @PutMapping("/{id}")
    public String editarVenta(@PathVariable int id, @RequestBody String venta){
        return "edita una venta con id por put" + venta + "con id" + id;
    }

    //DELETE - ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable int id) {
        return "Eliminar venta por delete" + id;
    }

}

package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facturas")
public class FacturasController {

    //GET - VER TODAS
    @GetMapping
    public String listarFacturas(){
        return "Muestra todos los facturas con GET ";
    }

    //GET con ID - VER con ID
    @GetMapping("/{id}")
    public String listarFactura(@PathVariable int id){
        return "Muestra una factura por ID con GET";
    }

    //POST - AGREGAR
    @PostMapping
    public String agregarFactura(@RequestBody String factura){
        return "Agregar factura por post" + factura;
    }

    //PUT - EDITAR
    @PutMapping("/{id}")
    public String editarFactura(@PathVariable int id, @RequestBody String factura){
        return "edita una factura con id por put" + factura + "con id" + id;
    }

    //DELETE - ELIMINAR
    @DeleteMapping("/{id}")
    public String eliminarFactura(@PathVariable int id) {
        return "Eliminar factura por delete" + id;
    }

}

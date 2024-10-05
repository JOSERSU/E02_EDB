package com.upiiz.ventas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/clientes/{clienteId}/facturas")
public class FacturaClienteController {

    // GET - Obtener todas las facturas de un cliente
    @GetMapping
    public String listarFacturasDeCliente(@PathVariable int clienteId) {
        return "Muestra todas las facturas del cliente con ID: " + clienteId;
    }

    // GET - Obtener una factura específica de un cliente
    @GetMapping("/{facturaId}")
    public String listarFacturaDeCliente(@PathVariable int clienteId, @PathVariable int facturaId) {
        return "Muestra la factura con ID: " + facturaId + " del cliente con ID: " + clienteId;
    }

}

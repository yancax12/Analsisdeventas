package com.example.salesdataanalysis.controller;

import com.example.salesdataanalysis.model.Sales;
import com.example.salesdataanalysis.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sales")
public class SalesController {

    @Autowired
    private SalesService salesService;

    // Endpoint para obtener todas las ventas
    @GetMapping("/all")
    public Iterable<Sales> getAllSales() {
        return salesService.getAllSales();
    }

    // Endpoint para generar el reporte de ventas
    @GetMapping("/report")
    public String generateSalesReport() {
        return salesService.generateSalesReport();
    }

    // Endpoint para agregar una venta
    @PostMapping("/add")
    public Sales addSale(@RequestBody Sales sale) {
        return salesService.saveSale(sale);
    }
}

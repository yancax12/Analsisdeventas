package com.example.salesdataanalysis.service;

import com.example.salesdataanalysis.model.Sales;
import com.example.salesdataanalysis.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesService {

    @Autowired
    private SalesRepository salesRepository;

    // Método para obtener todos los datos de ventas
    public Iterable<Sales> getAllSales() {
        return salesRepository.findAll();
    }

    // Método para generar el reporte de ventas
    public String generateSalesReport() {
        double totalRevenue = 0;
        for (Sales sale : salesRepository.findAll()) {
            totalRevenue += sale.getRevenue();
        }
        return "Reporte de Ventas: Total Ingresos = $" + totalRevenue;
    }

    // Método para guardar una venta
    public Sales saveSale(Sales sale) {
        return salesRepository.save(sale);
    }
}


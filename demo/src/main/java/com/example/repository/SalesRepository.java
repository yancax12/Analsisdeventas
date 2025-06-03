package com.example.salesdataanalysis.repository;

import com.example.salesdataanalysis.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesRepository extends JpaRepository<Sales, Long> {
    // Métodos personalizados si los necesitas
}

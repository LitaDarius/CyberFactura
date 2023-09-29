package com.example.lita.facturare.cyberfactura.repository;

import com.example.lita.facturare.cyberfactura.models.entity.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillRepository extends CrudRepository<Bill, Integer> {
}

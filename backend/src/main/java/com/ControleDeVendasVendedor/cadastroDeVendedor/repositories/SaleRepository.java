package com.ControleDeVendasVendedor.cadastroDeVendedor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ControleDeVendasVendedor.cadastroDeVendedor.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long>{

}

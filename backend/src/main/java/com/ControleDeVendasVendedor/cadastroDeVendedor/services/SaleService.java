package com.ControleDeVendasVendedor.cadastroDeVendedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ControleDeVendasVendedor.cadastroDeVendedor.entities.Sale;
import com.ControleDeVendasVendedor.cadastroDeVendedor.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findSales() {
		return repository.findAll();
	}

}

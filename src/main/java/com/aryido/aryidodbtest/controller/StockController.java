package com.aryido.aryidodbtest.controller;

import com.aryido.aryidodbtest.entity.Stock;
import com.aryido.aryidodbtest.repository.IStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YunYang Lee
 **/
@RestController
public class StockController {
	private IStockRepository stockRepository;

	@Autowired
	public StockController(IStockRepository stockRepository){
		this.stockRepository = stockRepository;
	}

	@GetMapping("/stocks")
	public List<Stock> getAll(){
		return stockRepository.findAll();
	}
}

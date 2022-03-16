package com.aryido.aryidodbtest.controller;

import com.aryido.aryidodbtest.entity.Stock;
import com.aryido.aryidodbtest.service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YunYang Lee
 **/
@RestController
public class StockController {
	private final IStockService stockService;

	@Autowired
	public StockController( IStockService stockService ) {
		this.stockService = stockService;
	}

	@GetMapping( "/stocks" )
	public List<? extends Stock> getAll() {
		return stockService.getAll();
	}

	@GetMapping("/{tableName}/stocks")
	public List<? extends Stock> getAllBy(@PathVariable("tableName") String tableName){
		return stockService.getAllByTable( tableName );
	}
}

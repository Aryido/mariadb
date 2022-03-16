package com.aryido.aryidodbtest.service;

import com.aryido.aryidodbtest.entity.Stock;

import java.util.List;

/**
 * @author YunYang Lee
 */
public interface IStockService {

	List<? extends Stock> getAll();

	List<? extends Stock> getAllByTable(String tableName);

}

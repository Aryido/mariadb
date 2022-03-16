package com.aryido.aryidodbtest.mapper;

import com.aryido.aryidodbtest.entity.Stock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author YunYang Lee
 */
public interface IStockMapper {
	List<Stock> findByTableName(@Param("tableName") String tableName);
}

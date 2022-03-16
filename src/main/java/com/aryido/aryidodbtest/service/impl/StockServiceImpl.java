package com.aryido.aryidodbtest.service.impl;

import com.aryido.aryidodbtest.entity.Stock;
import com.aryido.aryidodbtest.mapper.IStockMapper;
import com.aryido.aryidodbtest.repository.IStockRepository;
import com.aryido.aryidodbtest.service.IStockService;
import com.aryido.aryidodbtest.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YunYang Lee
 */
@Service
public class StockServiceImpl implements IStockService {
	private final IStockRepository stockRepository;

	public StockServiceImpl( IStockRepository stockRepository ){
		this.stockRepository = stockRepository;
	}

	@Override
	public List<? extends Stock> getAll() {
		return stockRepository.findAll();
	}

	@Override
	public List<? extends Stock> getAllByTable( String tableName ) {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		IStockMapper mapper = sqlSession.getMapper( IStockMapper.class );
		return mapper.findByTableName( tableName );
	}
}

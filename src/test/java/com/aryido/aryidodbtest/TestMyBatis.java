package com.aryido.aryidodbtest;

import com.aryido.aryidodbtest.entity.Stock;
import com.aryido.aryidodbtest.entity.Stock1;
import com.aryido.aryidodbtest.mapper.IStockMapper;
import com.aryido.aryidodbtest.repository.IStockRepository;
import com.aryido.aryidodbtest.util.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author YunYang Lee
 */
@SpringBootTest
public class TestMyBatis {

	@Autowired
	private IStockRepository<Stock> stockRepository;

	@Test
	public void testInit() {
		Stock1 build11 = Stock1.builder()
				.stockSymbol( "0050" )
				.price( "120" )
				.createTime( "2020/12/25 15:32:06" )
				.build();
		Stock1 build12 = Stock1.builder()
				.stockSymbol( "3045" )
				.price( "99.4" )
				.createTime( "2020/12/25 15:32:06" )
				.build();
		stockRepository.save( build11 );
		stockRepository.save( build12 );

		//Stock0 build01 = Stock0.builder()
		//		.stockSymbol( "2330" )
		//		.price( "509.0" )
		//		.createTime( "2020/12/25 15:32:06" )
		//		.build();
		//Stock0 build02 = Stock0.builder()
		//		.stockSymbol( "0056" )
		//		.price( "29.66" )
		//		.createTime( "2020/12/25 15:32:06" )
		//		.build();
		//stockRepository.save( build01 );
		//stockRepository.save( build02 );

	}

	@Test
	public void test() {
		SqlSession sqlSession = SqlSessionUtils.getSqlSession();
		IStockMapper mapper = sqlSession.getMapper( IStockMapper.class );
		List<Stock> byTableName1 = mapper.findByTableName( "stock0" );

		byTableName1.forEach( stock -> System.out.println( stock.getPrice() ) );
		byTableName1.forEach( stock -> System.out.println( stock.getStockSymbol() ) );
		List<Stock> byTableName2 = mapper.findByTableName( "stock1" );
		byTableName2.forEach( stock -> System.out.println( stock.getPrice() ) );
		byTableName2.forEach( stock -> System.out.println( stock.getStockSymbol() ) );
	}
}

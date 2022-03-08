package com.aryido.aryidodbtest;

import com.aryido.aryidodbtest.entity.Stock;
import com.aryido.aryidodbtest.mapper.IStockMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author YunYang Lee
 */
public class TestMyBatis {
	
	@Test
	public void test() throws IOException {
		InputStream resourceAsStream = Resources.getResourceAsStream( "config/mybatis-config.xml" );
		SqlSessionFactoryBuilder ssfBuilder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = ssfBuilder.build( resourceAsStream );
		SqlSession sqlSession = factory.openSession();
		IStockMapper mapper = sqlSession.getMapper( IStockMapper.class );
		List<Stock> byTableName1 = mapper.findByTableName("stock0");
		byTableName1.forEach( stock -> System.out.println(stock.getPrice()));
		byTableName1.forEach( stock -> System.out.println(stock.getStockSymbol()));
		List<Stock> byTableName2 = mapper.findByTableName("stock1");
		byTableName2.forEach( stock -> System.out.println(stock.getPrice()));
		byTableName2.forEach( stock -> System.out.println(stock.getStockSymbol()));
	}
}

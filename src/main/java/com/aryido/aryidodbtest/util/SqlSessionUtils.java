package com.aryido.aryidodbtest.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author YunYang Lee
 */
@Slf4j
public class SqlSessionUtils {
	private final static String MYBATIS_CONFIG_XML_PATH2 = "config/mybatis-config.xml";

	public static SqlSession getSqlSession(){
		SqlSession sqlSession = null;
		try{
			InputStream resourceAsStream = Resources.getResourceAsStream( MYBATIS_CONFIG_XML_PATH2 );
			SqlSessionFactoryBuilder ssfBuilder = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = ssfBuilder.build( resourceAsStream );
			sqlSession = factory.openSession(true);
		}catch (Exception e){
			log.error( e.getMessage() );
		}
		return sqlSession;
	}
}

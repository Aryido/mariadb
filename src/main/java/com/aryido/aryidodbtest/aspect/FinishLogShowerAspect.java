package com.aryido.aryidodbtest.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class FinishLogShowerAspect {

	/**
	 * The pointcut method with annotation.
	 */
	@Pointcut( "@annotation( com.aryido.aryidodbtest.aspect.FinishLogShower )" )
	public void withFinishLogShowerAspect(){}

	@Before( value = "withFinishLogShowerAspect()" )
	public void showLogStart( JoinPoint joinPoint ){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		log.info( "Start {}!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", signature.getName() );
	}

	@AfterReturning( value = "withFinishLogShowerAspect()" )
	public void showLogEnd( JoinPoint joinPoint ) throws InterruptedException {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		log.info( "Finish {} !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", signature.getName() );
		Thread.sleep( 5000 );
	}

	@After( value = "withFinishLogShowerAspect()" )
	public void showLogAfter( JoinPoint joinPoint ){
		log.info( "After" );
	}


	@AfterThrowing( value = "withFinishLogShowerAspect()")
	public void showLogThrowing( JoinPoint joinPoint){
		log.error( "error!!!" );
	}
}

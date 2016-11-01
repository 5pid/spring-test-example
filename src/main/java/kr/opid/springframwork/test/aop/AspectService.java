package kr.opid.springframwork.test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeongjun on 2016. 11. 1.
 */
@Slf4j
@Component
@Aspect
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AspectService {

	@Pointcut("@annotation(AopAnnotation)")
	public void performance() {
	}

	@Around("performance()")
	public void verify(ProceedingJoinPoint joinPoint) {
		try {
			log.info("before");
			joinPoint.proceed();
			log.info("after");
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}
}

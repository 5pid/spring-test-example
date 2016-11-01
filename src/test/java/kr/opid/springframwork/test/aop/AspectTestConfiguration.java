package kr.opid.springframwork.test.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author yeongjun on 2016. 11. 1.
 */
@EnableAspectJAutoProxy
@WebAppConfiguration
//@TestConfiguration
public class AspectTestConfiguration {

	@Bean
	public AspectService aspectService() throws Exception {
		return new AspectService();
	}

	@Bean
	public AspectTest aspectTest() throws Exception {
		return new AspectTest();
	}
}

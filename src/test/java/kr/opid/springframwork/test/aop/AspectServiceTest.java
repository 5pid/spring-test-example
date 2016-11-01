package kr.opid.springframwork.test.aop;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yeongjun on 2016. 11. 1.
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AspectTestConfiguration.class)
public class AspectServiceTest {
	@Autowired
	private AspectTest aspectTest;

	@Test
	public void aopTest() {
		// given
		// when
		// then
		aspectTest.test();
	}
}

@Slf4j
class AspectTest {
	@AopAnnotation
	void test() {
		log.info("body");
	}
}
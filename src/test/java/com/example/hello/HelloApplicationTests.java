package com.example.hello;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//springboot单元测试

@SpringBootTest
class HelloApplicationTests {

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		
		//日志级别，由低到高
		//可以调整输出的日志级别：日志只会在这个级别已经高级别后生效
		logger.trace("这是trace日志....");
		logger.debug("这是debug日志....");
		//springBoot 默认输出info级别及其以后
		logger.info("这是info日志....");
		logger.warn("这是warn日志....");
		logger.error("这是error日志....");
	}

}

package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //标注一个主程序类，说明这是一个Spring Boot应用
public class HelloApplication {

	public static void main(String[] args) {
		
		//启动
		SpringApplication.run(HelloApplication.class, args);
	}

}

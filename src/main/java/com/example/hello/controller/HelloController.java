package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = "swagger测试", value = "swagger测试接口")
@RestController
@RequestMapping(value = "/app")
public class HelloController {

	@RequestMapping(value = "/Hello", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String hello() {
		return "hello word";
	}
}

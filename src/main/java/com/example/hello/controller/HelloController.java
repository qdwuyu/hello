package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

//api描述
@Api(tags = "swagger测试", value = "swagger测试接口")
//Controller标识控制类+ResponseBody把return的结果变成JSON对象返回(免去跳转)。
@RestController
@RequestMapping(value = "/app")
public class HelloController {

	//地址映射
	@RequestMapping(value = "/Hello", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
	public String hello() {
		return "hello word";
	}
}

package com.example.hello.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//配置Swagger的Docket的Bean实例
	//将方法的返回值添加到容器中
	@Bean
	public Docket docket(Environment environment) {
		
		//设置显示Swagger的环境
		Profiles profiles = Profiles.of("dev");
		//获取项目环境
		boolean flag = environment.acceptsProfiles(profiles);
		
		
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.enable(flag)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.hello.controller")) //扫描路径
				.paths(PathSelectors.any()) //过滤类型
				.build();
	}
	
	//配置Swagger信息=apiInfo
	private ApiInfo apiInfo() {
		
		//作者信息
		Contact contact =new Contact("wuyu","https://qdwuyu.github.io/","2254610509@qq.com");
		return new ApiInfo(
				"wuyu的SwaggerAPI文档", 
				"描述", 
				"1.0", 
				"https://qdwuyu.github.io/",
		        contact, 
		        "Apache 2.0", 
		        "http://www.apache.org/licenses/LICENSE-2.0", 
		        new ArrayList<VendorExtension>());
	}
}

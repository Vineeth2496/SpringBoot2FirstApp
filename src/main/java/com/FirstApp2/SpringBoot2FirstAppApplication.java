package com.FirstApp2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// ctrl + shfit + O
@SpringBootApplication
public class SpringBoot2FirstAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(SpringBoot2FirstAppApplication.class, args);
		
		MyViewResolver ob=ac.getBean("myview", MyViewResolver.class);
		
		System.out.println("Hello");
		
		System.out.println(ob);
	}
}

package com.dubbo.demo.producer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class launch {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application.xml" });
		context.start();
		System.out.println("按任意键退出");
		System.in.read();
	}
}

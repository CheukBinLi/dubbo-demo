package com.dubbo.demo.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.common.Data;
import com.dubbo.demo.common.IProcessData;

public class launch {
	public void sayHello() {
		// System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "application.xml" });
		context.start();
		IProcessData demoService = (IProcessData) context.getBean("demoService");
		System.out.println(demoService.hello("world"));
		Data data = (Data) context.getBean("dataService");
		System.out.println(data.xiaoLaBa());
	}

	public static void main(String[] args) {
		new launch().sayHello();
	}
}

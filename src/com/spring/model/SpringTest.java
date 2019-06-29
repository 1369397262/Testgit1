package com.spring.model;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringTest {
	//static ApplicationContext ctx = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("===@BeforeClass===");
		//ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		System.out.println("===test===");
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("ApplicationContext.xml");
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		helloWorld.hello(); // Êä³ö hello:spring
		
		HelloWorld hw = new HelloWorld();
		hw.hello();
	}

	@Test
	public void test2() {
		
		System.out.println("===test2===");
		ApplicationContext ctx =  new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println(ctx);
		HelloWorld hw = (HelloWorld) ctx.getBean("helloWorld2");
		System.out.println(hw);
		hw.hello(); // Êä³ö hello:spring
		
		
	}
	
}

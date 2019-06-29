package com.spring.model;

public class HelloWorldFactory {
	public static HelloWorld createHelloWorld(){
		System.out.println("===createHelloWorld===");
		return new HelloWorld();
	}
}

package com.mule.demo.ws;

public class GreetingServiceImpl implements GreetingService {

	public String sayHello(String name) {
	   if (name == null) {
	      return "Hello World!";
	   }
	   else {
	      return "Hello " +name;
	   }
	}
}


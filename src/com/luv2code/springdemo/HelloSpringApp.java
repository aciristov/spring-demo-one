package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
//		Coach newCoach = context.getBean("newbean", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		// use of the new bean!
//		System.out.println(newCoach.getDailyFortune());
		
		System.out.println(theCoach.getDailyFortune());
		// close the context
		context.close();

	}

}

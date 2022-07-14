package com.shubham.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("\nPointing to the same object: " + (theCoach == alphaCoach));
		System.out.println("\nMemory location of theCoach: " + theCoach);
		System.out.println("\nMemory location of alphaCoach: " + alphaCoach + "\n");
		
		//close the context
		context.close();
	}

}

package com.shubham.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	// define a default constructor
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}

	// define my init method
	@PostConstruct
	public void doMyStuff() {
		System.out.println("TennisCoach: inside doMyStuff() init method");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanup() {
		System.out.println("TennisCoach: inside doMyCleanup() destroy method");
	}
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	// define a setter method
	/*
	 * @Autowired public void setFortuneService(FortuneService theFortuneService) {
	 * System.out.println("inside setFortuneService setter"); fortuneService =
	 * theFortuneService; }
	 */

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

package com.shubham.springdemo;

import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "do 10 100m sprints!!!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}

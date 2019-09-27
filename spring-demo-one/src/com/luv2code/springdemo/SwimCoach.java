package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;	
	
	public SwimCoach() {
		// TODO Auto-generated constructor stub
	}
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim laps";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}

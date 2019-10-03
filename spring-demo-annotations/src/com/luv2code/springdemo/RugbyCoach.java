package com.luv2code.springdemo;

public class RugbyCoach implements Coach {

	private FortuneService fortuneService;
	
	public RugbyCoach (FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "learn how to play rugby";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}


	
}

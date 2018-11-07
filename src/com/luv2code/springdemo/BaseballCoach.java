package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for depencency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Method by BaseballCoach";
	}
	
	@Override
	public String getDailyFortune() {
		// use my fortuneSercice to get a fortune
		return fortuneService.getFortune();
	}
	
}

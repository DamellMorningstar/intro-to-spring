package com.luv2code.springdemo;

public class SoccerCoach implements Coach {
	
	private FortuneService fortuneService;

	public SoccerCoach(FortuneService fortuneservice) {
		super();
		this.fortuneService = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		return "Pratice dribbling for an hour";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

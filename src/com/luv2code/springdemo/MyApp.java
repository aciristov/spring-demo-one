package com.luv2code.springdemo;

public class MyApp {

	private String brand;
	private boolean empty;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyApp wb = new MyApp();
		System.out.println(wb.brand);
		System.out.println(wb.empty);
		
		Coach theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		
	}

}

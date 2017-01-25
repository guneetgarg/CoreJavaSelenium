package com.DateTime;

import java.time.LocalDate;

public class LocalDateExample {
	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		System.out.println("Today date: " + date);

		LocalDate yesterday = date.minusDays(1);
		System.out.println("Yesterday date: " + yesterday);
		
		LocalDate tomorrow = date.plusDays(1);
		System.out.println("Tommorow date: " + tomorrow);

		System.out.println("******************* Checking Leap Year *******************");
		// public static LocalDate of(int year, int month, int dayOfMonth)	
		LocalDate date1 = LocalDate.of(2017, 9, 13);
		System.out.println(date1.isLeapYear());

		LocalDate date2 = LocalDate.of(2016, 9, 23);
		System.out.println(date2.isLeapYear());

	}
}
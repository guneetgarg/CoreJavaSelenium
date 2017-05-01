package com.date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TestDate1 {
	/*
	 * • Create and manipulate calendar data using classes from
	 * java.time.LocalDateTime, java.time.LocalDate, java.time.LocalTime,
	 * java.time.format.DateTimeFormatter, java.time.Period
	 */
	public static void main(String[] args) {

		// Get current date time
		LocalDateTime now = LocalDateTime.now();

		System.out.println("Before : " + now);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		String formatDateTime = now.format(formatter);

		System.out.println("After : " + formatDateTime);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfWeek());
		
		Calendar startDate = Calendar.getInstance();

	    if (startDate.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
	        System.out.println("true");
	    }else {
	        System.out.println("FALSE");
	    }

	}
}
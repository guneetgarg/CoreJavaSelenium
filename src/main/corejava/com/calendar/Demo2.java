package com.calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo2 {
	public static void main(String[] args) throws ParseException {
		/*
		 * Date date = new Date(); SimpleDateFormat dateFormat = new
		 * SimpleDateFormat("EEEEE"); String dayOfWeek =
		 * dateFormat.format(date); System.out.println(dayOfWeek);
		 */

		String due_dt;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, 4);
		due_dt = dateFormat.format(c.getTime());
		System.out.println(due_dt);

		SimpleDateFormat format = new SimpleDateFormat("EEEEE");
		System.out.println(format.format(c.getTime()));
		switch (format.format(c.getTime())) {
		case "Sunday":
			c = Calendar.getInstance();
			c.add(Calendar.DATE, 5+1);
			due_dt = dateFormat.format(c.getTime());
			System.out.println(due_dt);
			break;
		case "Saturday":
			c = Calendar.getInstance();
			c.add(Calendar.DATE, 4+2);
			due_dt = dateFormat.format(c.getTime());
			System.out.println(due_dt);
			break;
		}

	}

}
package com.temp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo1 {
	public static void main(String[] args) {
		String due_dt;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		c.add(Calendar.DATE, 7);
		due_dt = dateFormat.format(c.getTime());
		System.out.println(due_dt);
	}
}
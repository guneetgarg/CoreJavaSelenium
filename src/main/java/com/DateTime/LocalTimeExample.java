package com.DateTime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LocalTimeExample {
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("Current Time -> " + time);

		LocalTime time2 = time.minusHours(2);
		LocalTime time3 = time.minusMinutes(34);
		System.out.println(time2);
		System.out.println(time3);

		time2 = time.plusHours(4);
		time3 = time2.plusMinutes(18);
		System.out.println(time3);

		Set<String> set = SHORT_IDS.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			Object key = itr.next();
		//	System.out.println(key + "-->" + SHORT_IDS.get(key));
		}
		
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
	    ZoneId zone2 = ZoneId.of("-05:00");  
	    LocalTime time1 = LocalTime.now(zone1);  
	    System.out.println("India Time Zone: "+time1);  
	     time2 = LocalTime.now(zone2);  
	    System.out.println("Japan Time Zone: "+time2);  
	    long hours = ChronoUnit.HOURS.between(time1, time2);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time1, time2);  
	    System.out.println("Minutes between two time zone: "+minutes);  

	}
	
	  public static Map<String, String> SHORT_IDS;
	    static {
	        Map<String, String> map = new HashMap<String, String>(64);
	        map.put("ACT", "Australia/Darwin");
	        map.put("AET", "Australia/Sydney");
	        map.put("AGT", "America/Argentina/Buenos_Aires");
	        map.put("ART", "Africa/Cairo");
	        map.put("AST", "America/Anchorage");
	        map.put("BET", "America/Sao_Paulo");
	        map.put("BST", "Asia/Dhaka");
	        map.put("CAT", "Africa/Harare");
	        map.put("CNT", "America/St_Johns");
	        map.put("CST", "America/Chicago");
	        map.put("CTT", "Asia/Shanghai");
	        map.put("EAT", "Africa/Addis_Ababa");
	        map.put("ECT", "Europe/Paris");
	        map.put("IET", "America/Indiana/Indianapolis");
	        map.put("IST", "Asia/Kolkata");
	        map.put("JST", "Asia/Tokyo");
	        map.put("MIT", "Pacific/Apia");
	        map.put("NET", "Asia/Yerevan");
	        map.put("NST", "Pacific/Auckland");
	        map.put("PLT", "Asia/Karachi");
	        map.put("PNT", "America/Phoenix");
	        map.put("PRT", "America/Puerto_Rico");
	        map.put("PST", "America/Los_Angeles");
	        map.put("SST", "Pacific/Guadalcanal");
	        map.put("VST", "Asia/Ho_Chi_Minh");
	        map.put("EST", "-05:00");
	        map.put("MST", "-07:00");
	        map.put("HST", "-10:00");
	        SHORT_IDS = Collections.unmodifiableMap(map);
	    }
}
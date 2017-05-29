package com.temp;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {

		String[] actual = { "Confirmation:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Negative Ack:receive:04"," Error:receive:04"," DLR:receive:04"," Ack:receive:04"," DJ:submit:04"," DJ:save:04"," Confirmation:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Negative Ack:receive:03"," Error:receive:03"," Ack:receive:03"," DLR:receive:03"," DJ:submit:03"," DJ:save:03"," Confirmation:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Error:receive:02"," Negative Ack:receive:02"," DLR:receive:02"," DJ:submit:02"," DJ:save:02"," Confirmation:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Error:receive:01"," Negative Ack:receive:01"," DLR:receive:01"," Ack:receive:01"," DJ:submit:01"," DJ:save:01"," Clarification:receive:00"," Clarification:receive:00"," Clarification:receive:00"," Clarification:receive:00"," Clarification:receive:00"," Error:receive:00"," Negative Ack:receive:00"," DLR:receive:00"," Ack:receive:00"," DD:submit:00","DD:save:00" };

		String[] expected = { "Ack:receive:00"," DLR:receive:00"," Negative Ack:receive:00"," Error:receive:00","Clarification:receive:00"," Clarification:receive:00"," Clarification:receive:00"," Clarification:receive:00"," Clarification:receive:00"," DD:save:00"," DD:submit:00"," Ack:receive:01"," DLR:receive:01"," Negative Ack:receive:01"," Error:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Clarification:receive:01"," Confirmation:receive:01"," DD:save:01"," DD:submit:01"," DLR:receive:02"," Negative Ack:receive:02"," Error:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Clarification:receive:02"," Confirmation:receive:02"," DD:save:02"," DD:submit:02"," Ack:receive:03"," DLR:receive:03"," Negative Ack:receive:03"," Error:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Clarification:receive:03"," Confirmation:receive:03"," DD:save:03"," DD:submit:03"," Ack:receive:04"," DLR:receive:04"," Negative Ack:receive:04"," Error:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Clarification:receive:04"," Confirmation:receive:04"," DD:save:04"," DD:submit:04" };

		
		System.out.println(actual.length);
		System.out.println(expected.length);
		Arrays.sort(actual);
		Arrays.sort(expected);
		
		//System.out.println("ACT " + Arrays.toString(actual));
	//	System.out.println("EXP " + Arrays.toString(expected));

		for(int i=0; i<expected.length; i++){
			System.out.println(expected[i]);
		}
		
	}
}
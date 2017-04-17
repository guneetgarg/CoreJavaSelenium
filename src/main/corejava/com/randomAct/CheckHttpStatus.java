package com.randomAct;

import java.net.HttpURLConnection;
import java.net.URL;

public class CheckHttpStatus {
	public static void main(String args[]) {
		boolean flag = true;
		try {
			URL url = new URL("http://192.168.73.10:3292/axis/services/AsrResponseReceiverSEI");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();

			int code = connection.getResponseCode();
			System.out.println(url);
			System.out.println("Response code of the object is " + code);
			if (code == 200) {
				System.out.println("OK");
			}
		} catch (Exception e) {
			flag = false;
		}
		if (flag == false) {
			System.out.println("Invallid Url");
		}
	}
}
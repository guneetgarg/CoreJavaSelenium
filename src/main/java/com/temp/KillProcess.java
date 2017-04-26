package com.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KillProcess {

	public static void main(String[] args) throws IOException {
		ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c",
				"taskkill /im iexplore.exe /im IEDriverServer.exe /f");
		builder.redirectErrorStream(true);
		Process p = builder.start();
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while (true) {
			line = r.readLine();
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
	}
}

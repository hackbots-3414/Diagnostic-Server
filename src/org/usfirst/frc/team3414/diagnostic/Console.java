package org.usfirst.frc.team3414.diagnostic;

import java.util.Scanner;

public class Console implements Runnable {
	//TODO actually implement this
	public void run() {
		parseInput();
	}
	static String message;
	static Scanner scanner = new Scanner(System.in);
	public static void parseInput() {
    	System.out.println("Input command:");
    	String input = scanner.nextLine();
    	if(input.equalsIgnoreCase("exit")) {
    		System.exit(0);
    }
    	else {
    	System.out.println("use 'exit' or 'connect'");
    	parseInput();
    	}
    }
}

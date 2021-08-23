package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to start the clock");
		double start = scanner.nextDouble();
		
		start = System.currentTimeMillis();
		System.out.println("Enter 0 to stop the clock");
		double stop = scanner.nextDouble();
		stop = System.currentTimeMillis();
		
		double elapsed_time = (stop - start) / 1000;
		System.out.println("Elapsed time is " + elapsed_time + " seconds");
		scanner.close();
	}
}

package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		boolean isPrime = true;
		System.out.println("Enter a number:");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number <= 1) {
			isPrime = false;
		} else if (number == 2) {
			isPrime = true;
		} else if (number % 2 == 0) {
			isPrime = false;
		} else {
			for (int i = 3; i <= Math.sqrt(number); i += 2) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(number + " is a Prime Number!");
		} else {
			System.out.println(number + " is not a Prime Number!");
		}
		scanner.close();
	}
}

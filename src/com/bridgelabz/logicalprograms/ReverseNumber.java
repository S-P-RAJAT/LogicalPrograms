package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int reverseNumber = 0;
		int remainder;

		System.out.println("Enter a number:");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		while (number > 0) {
			remainder = number % 10;
			reverseNumber = (reverseNumber * 10) + remainder;
			number = number / 10;
		}
		System.out.println("Reversed number: " + reverseNumber);
	}
}

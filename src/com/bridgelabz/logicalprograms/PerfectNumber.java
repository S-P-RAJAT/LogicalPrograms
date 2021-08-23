package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int number;
		boolean isPerfect = false;
		System.out.println("Enter a number(>1):");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		if (number > 1) {
			int sum = 1;
			for (int i = 2; i * i <= number; i++) {
				if (number % i == 0) {
					if (i * i == number)
						sum += i;
					else
						sum += i + (number / i);
				}
			}
			if (sum == number) {
				System.out.println(number + " is a Perfect Number!");
			} else {
				System.out.println(number + " is not a Perfect Number!");
			}
		} else {
			System.out.println("Please enter a number greater than 1.");
		}
	}
}

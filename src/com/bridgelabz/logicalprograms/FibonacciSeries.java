package com.bridgelabz.logicalprograms;

public class FibonacciSeries {
	public static void main(String[] args) {
		int fibonacciLimit = 15;
		int currentTerm = 1, previousTerm = 0;
		for (int i = 1; i <= fibonacciLimit; i++) {
			System.out.print(previousTerm + " ");

			currentTerm += previousTerm;
			previousTerm = currentTerm - previousTerm;
		}
	}
}
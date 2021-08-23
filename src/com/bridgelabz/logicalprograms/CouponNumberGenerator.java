package com.bridgelabz.logicalprograms;

public class CouponNumberGenerator {
	public static void main(String[] args) {
		int couponNumberLength = 6;
		boolean[] distinctValueArray = new boolean[couponNumberLength];
		int randomNumberCount = 0;
		int distinctNumberCount = 0;
		System.out.println("The " + couponNumberLength + " distinct numbers are: ");
		
		while (distinctNumberCount < couponNumberLength) {
			int value = (int) (Math.random() * couponNumberLength);
			randomNumberCount++;
			if (!distinctValueArray[value]) {
				distinctNumberCount++;
				distinctValueArray[value] = true;
				System.out.print(value+" ");
			}
		}

		System.out.println("\nTotal number of random numbers generated to get " + couponNumberLength
				+ " distinct numbers is " + randomNumberCount);
	}
}

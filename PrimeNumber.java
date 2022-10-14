package com.PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Compute Prime Factorization Program");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();

		for (int i = 3; i <= number; i++) {
			while (number % i == 0) {
				System.out.println(i);
				number = number / i;
			}
		}

	}
}

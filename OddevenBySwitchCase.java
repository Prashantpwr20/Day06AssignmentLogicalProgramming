package com.PrimeNumber;

import java.util.Scanner;

public class OddevenBySwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Number : ");
		int num = scan.nextInt();

		switch (num % 2) {

		case 0:
			System.out.println(num + "is Even Number");
			break;
		case 1:
			System.out.println(num + "is Odd Number");
			break;
		default:
			System.out.println(num + "is default Number");

		}
	}
}
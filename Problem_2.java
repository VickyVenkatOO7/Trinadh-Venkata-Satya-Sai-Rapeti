package com.problems;

import java.util.Scanner;

public class Problem_2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number (a): ");
		int a = scan.nextInt();

		for (int i = 0; i < a; i++) {
			int number = 2 * i + 1;
			System.out.print(number);

			if (i < a - 1) {
				System.out.print(", ");
			}
		}
		scan.close();
	}

}

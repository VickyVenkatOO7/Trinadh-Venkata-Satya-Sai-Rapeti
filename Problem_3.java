package com.problems;

import java.util.Scanner;

public class Problem_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter value of (a): ");
        int a = scan.nextInt();

        if (a % 2 == 0) {
            a = a - 1;
        }

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);
            if (i + 2 <= a) {
                System.out.print(", ");
            }
        }

        scan.close();
    }
}

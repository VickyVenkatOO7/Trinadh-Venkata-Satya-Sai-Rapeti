package com.problems;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem_4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// No Of Elements
        System.out.print("Enter the number of elements: ");
        int n = scan.nextInt();

        int[] input = new int[n];
        System.out.println("Enter " + n + " numbers:");

        // Indexing the array with elements
        for (int i = 0; i < n; i++) {
            input[i] = scan.nextInt();
        }

        Map<Integer, Integer> result = new LinkedHashMap<>();
        
        // Mapping 1 to 9 numbers with count zero
        for (int i = 1; i <= 9; i++) {
            result.put(i, 0);
        }

        // Counting how many numbers are divisible by each number 1 to 9
        for (int num : input) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    result.put(i, result.get(i) + 1);
                }
            }
        }
        
        // Dictionary liek Map
        System.out.println(result);

        scan.close();
    }
}

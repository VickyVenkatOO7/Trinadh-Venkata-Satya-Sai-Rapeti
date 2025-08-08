package com.problems;
import java.util.Scanner;

public class Problem_1 {
	
	public static void performCalculation() {
		Scanner scan = new Scanner(System.in);
		String continution;
		
		do {
			System.out.print("Enter first number (a): ");
			double a = scan.nextDouble();
			
			System.out.print("Enter second number (b): ");
			double b = scan.nextDouble();
			
			System.out.print("Enter operation (add, subtract, multiply, divide): ");
			String operation = scan.next();
			
			double result;
			
			switch(operation.toLowerCase()) {
				case "add":
					result = a + b;
					System.out.println("Result: " + result);
					break;
				
				case "subtract":
					result = a - b;
					System.out.println("Result: " + result);
					break;
					
				case "multiply":
					result = a * b;
					System.out.println("Result: " + result);
					break;
					
				case "divide":
					if(b != 0) {
						result = a / b;
						System.out.println("Result: " + result);
					}
					else {
						System.out.println("Error: cannot divide by zero.");
					}
					break;
					
				default:
					System.out.println("Error: Invalid operation.");
			}
			
			System.out.println();
			System.out.print("Do you want to perform another calculation? (yes/no): ");
			continution = scan.next();
			System.out.println();
		} while(continution.equalsIgnoreCase("yes"));
		
		scan.close();
		System.out.println("Calculator closed. Thank you.");
	}
	
	public static void main(String[] args) {
		performCalculation();
	}
}

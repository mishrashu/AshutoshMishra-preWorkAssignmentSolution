package preworkassignment;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {
		int reversedNumber = 0;
		int remainder;
		int orignalNumber;

		int number = sc.nextInt();
		orignalNumber = number;

		while (number > 0) {
			remainder = number % 10;
			reversedNumber = (reversedNumber * 10) + remainder;
			number = number / 10;
		}

		if (orignalNumber == reversedNumber) {
			System.out.println(orignalNumber + " is a palindrome");
		} else {
			System.out.println(orignalNumber + " is not a palindrome as it's reverse number is " + reversedNumber);
		}
	}

	// function to printPattern

	public void printPattern() {

		int numberOfRows;
		numberOfRows = sc.nextInt();
		if (numberOfRows > 0) {
			for (int i = 0; i < numberOfRows; i++) {
				for (int j = 0; j < numberOfRows - i; j++) {
					System.out.print("*");
				}
				System.out.println("\n");
			}
		}
	}

	// function to check no is prime or not

	public void checkPrimeNumber() {
		int number = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i < number / 2; i++) {
			if (number % 2 == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(number + " is a prime number.");
		} else {
			System.out.println(number + " is not a prime number.");
		}
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1;

		int numberOfTerms = 0;
		int temp;

		System.out.print("Please enter number of terms: ");
		numberOfTerms = sc.nextInt();

		System.out.print("Fibonacci Series for " + numberOfTerms + " terms is:");
		System.out.print(first + " ");
		System.out.print(second + " ");
		for (int i = 0; i < numberOfTerms - 2; i++) {
			temp = first + second;
			System.out.print(temp + " ");
			first = second;
			second = temp;
		}

	}

//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\n\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();
			}
				break;

			case 2: {

				obj.printPattern();
			}
				break;

			case 3: {

				obj.checkPrimeNumber();
			}
				break;

			case 4: {

				obj.printFibonacciSeries();
			}
				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");
			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}

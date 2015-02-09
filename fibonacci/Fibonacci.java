import java.util.Scanner;

/*
Simple Java program to compute the first term greater
than 1000 in the sequence, as well as the summation of the
values up to that term.

*work in progress*

*/

public class Fibonacci {

	private static Scanner user_input = new Scanner( System.in );

	public static void main(String[] args) {

		System.out.println("enter an interation:");
		int value = user_input.nextInt();
		iteration( value );
	}

	public static void iteration( int x ) {

		// f(n) = (n-1) + (n-2)
		int sum = 0;  // sum of sequence
		int sum1 = 0; // temp sum of sequence
		int n = 3;    // iteration of sequence

		// while (int n=0; n <= x; n++) 
		do {
			sum1 = (n-1) + (n-2); 
			sum = sum + sum1; 
			n++;

		} while (n <= x);

		System.out.println("sum of the iteration is: ");
		System.out.println(sum); 
		// sum = (n-1) + (n-2);

	}
}
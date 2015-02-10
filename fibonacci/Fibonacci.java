import java.util.Scanner;

/*
Simple Java program to compute the first term greater
than 1000 in the sequence, as well as the summation of the
values up to that term.

*work in progress*

*/

public class Fibonacci {

	private static Scanner user_input = new Scanner(System.in); 

	public static void main(String[] args) {

		System.out.print("Enter an interation: ");
		int value = user_input.nextInt();
		iteration(value);

		System.out.print("Fibonacci Series: ");
		
		// Prints Fibonacci up to value
		for (int i = 1; i <= value; i++) {
			System.out.print(iteration(i) + " "); 
		}

	}

// Keeps count of iteration through Fibonacci series.
	public static int iteration(int x) {

		if (x == 1 || x == 2) {
			return 1; 
		}

		return iteration(x - 1) + iteration(x - 2); // 

	}

// Fibonacci sum
	public static int fibonacci(int x) {
		// f(n) = f(n-1) + f(n-2)
		int fib = 0;  // sum of sequence
		int fib1 = 0; // temp sum of sequence
		int fib2 = 0;    // iteration of sequence

		// while (int n=0; n <= x; n++) 

		System.out.println("sum of the iteration is: ");
		System.out.println(sum); 
		// sum = (n-1) + (n-2);

	}
	
}
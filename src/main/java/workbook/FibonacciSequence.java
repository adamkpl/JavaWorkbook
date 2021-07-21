package workbook;

import static net.andreinc.mockneat.unit.types.Ints.ints;

public class FibonacciSequence {
	public static void main(String[] args) {
		printFibonacciSequence(ints().range(10, 30).get());
	}

	private static void printFibonacciSequence(int maxNumber) {
		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci sequence of " + maxNumber + " numbers: ");

		for (int i = 1; i <= maxNumber; ++i) {
			System.out.print(previousNumber + " ");

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}
}
package lab2;

import java.util.Optional;
import java.util.function.Function;
import java.util.stream.IntStream;

public class PowerSumSolution {

/**
 *  Source has been used -
 *  https://www.geeksforgeeks.org/find-ways-integer-can-expressed-sum-n-th-power-unique-natural-numbers/	
 */

public static int result = 0;
	
	

	public static int RecursiveSubtraction(int X, int N, int num, int currentPos) {
		
		/**
		 * Iterates result by 1 if X equals to 0
		 */
		Optional.of(X)
			.filter(i -> i == 0)
			.map(i -> result++);
		
		/**
		 * Returns minimal value which is more or equal to X^N
		 */
		int Max = (int) Math.floor(Math.pow(num, 1.0 / N));
		
		/**
		 * Function which is used in chain.
		 * Returns result of subtraction between X and i^N;  i means position
		 */
		Function<Integer, Integer> subtract = i -> X - (int)Math.pow(i, N);
		
		/**
		 * 
		 */
		IntStream.rangeClosed(currentPos + 1 , Max)
			.filter(i -> subtract.apply(i) >= 0)
			.map(i ->RecursiveSubtraction(subtract.apply(i), N, num, i))	
			.sum();
		return result;
	}
	public static int PowerSum (int X, int N) {
		return RecursiveSubtraction(X,N,X,0);
	}
	public static void main(String[] args) {
		System.out.println(PowerSum(100,2));
	}

}

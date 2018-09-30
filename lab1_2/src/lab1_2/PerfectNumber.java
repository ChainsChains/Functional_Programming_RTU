package lab1_2;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumber {

	public enum STATE {
		PERFECT, DEFICIENT, ABUNDANT
	}
	
	public static void main(String[] args) {
		process(9);
	}

	public static Set<Integer> divisors(int n) {
		return IntStream
				.rangeClosed(1,(int) Math.sqrt(n))
				.filter(x -> n%x == 0)
				.boxed()
				.collect(Collectors.toSet());
	}

	public static STATE process(int n) {
		
		int sum = divisors(n)
			.stream()
			.filter(i -> i!=n)
			.reduce(Integer::sum).get();
		
		if (sum > n) {
			return STATE.ABUNDANT;
		} else {
			return sum < n ? STATE.DEFICIENT : STATE.PERFECT;
		}

	}
	
}

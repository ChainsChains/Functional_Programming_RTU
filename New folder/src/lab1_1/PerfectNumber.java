package lab1_1;

import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {

	public enum STATE {
		PERFECT, DEFICIENT, ABUNDANT
	}

	public static Set<Integer> divisors(int n) {
		Set<Integer> divisors = new HashSet<Integer>();
		for (int x = 1; x <= n; x++) {
			if (n % x == 0) {
				divisors.add(x);
			}
		}
		return divisors;
	}

	public static STATE process(int n) {
		Set<Integer> divisors = divisors(n);
		int sum = 0;
		for (Integer div : divisors) {
			sum += div;
		}
		sum -= n;

		if (sum < n)
			return STATE.DEFICIENT;
		if (sum > n)
			return STATE.ABUNDANT;

		return STATE.PERFECT;

	}

}


public class FinMinMaxArray {

	public static void main(String[] args) {

		int[] elements = { 1, 6, 8, 5, 34, 89, 33 };
		int max = Integer.MIN_VALUE;// elements[0];
		int min = Integer.MAX_VALUE;// elements[0];

		for (int i = 0; i < elements.length; i++) {
			if (max < elements[i])
				max = elements[i];
			if (min > elements[i])
				min = elements[i];
		}

		System.out.println(min + " " + max);

	}

}

class Calculator {
	int i = 0;

	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n and p should be non-negative");
		else
			return (int) Math.pow(n, p);

	}

}
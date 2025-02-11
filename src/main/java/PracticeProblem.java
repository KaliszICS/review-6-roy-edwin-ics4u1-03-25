public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static int sum(int sum1, int sum2) {
		int result = sum1 + sum2;
		return result;
	}
	
	public static int difference(int difference1, int difference2) {
		int differences = (difference1-difference2);
		return differences;
	}

	public static double product(double multi1, double multi2) { 
		return multi1*multi2;
	}

	public static String removeFirst(String rem1) {
		return rem1.substring(1);
	}

	public static int combinedLength(String yum1, String yum2) { 
		return yum1.length()+yum2.length();
	}
	
	public static boolean isEven(int zero) { 
		return zero % 2 == 0;
	}
	
	public static boolean isOdd(int notzero) { 
		return !(notzero % 2 == 0);
	}

	public static boolean isPositive(int positive) { 
		return positive > 0;
	}

	public static boolean isNegative(int negative) { 
		return negative < 0;
	}
}

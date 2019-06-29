public class MathLib {
	public static final double pi = 3.1415926535897932;

	// returns input to the nth power
	public static double getNthPower(double input, int n) {
		double output = input;
		for(int i = 0; i < (n - 1); i++) {
			output *= input;
		}
		return output;
	}

	// returns square root of input
	public static double getSquareRoot(double input) {
		return getNthRoot(input, 2);
	}

	// returns nth root of input
	public static double getNthRoot(double input, int n) {
		double floor;
		double ceiling = 0;
		double sqRt = 0;
		while(getNthPower(ceiling, n) < input) {
			ceiling++;
		}
		if(getNthPower(ceiling, n) != input) {
			floor = ceiling - 1;
			for(int i = 0; i < 16; i++) {
				sqRt = floor + ((ceiling - floor) / 2);
				if(sqRt * sqRt > input) {
					ceiling = sqRt;
				} else if(sqRt * sqRt < input) {
					floor = sqRt;
				} else {
					break;
				}
			}
		} else {
			sqRt = ceiling;
		}
		return sqRt;
	}
}
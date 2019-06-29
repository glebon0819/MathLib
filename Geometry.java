public class Geometry extends MathLib {
	
	// 2D shape attribute methods
	public static double getCircumference(double radius) {
		return 2.0 * pi * radius;
	}
	public static double getHypotenuse(double sideA, double sideB) {
		double cSquared = (sideA * sideA) + (sideB * sideB);
		return getSquareRoot(cSquared);
	}

	// 2D shape area methods
	public static double getCircleArea(double radius) {
		return pi * radius * radius;
	}
	public static double getRectangleArea(double sideA, double sideB) {
		return sideA * sideB;
	}
	public static double getTriangleArea(double base, double height) {
		return base * height * 0.5;
	}
}
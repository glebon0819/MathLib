public class Example {
	public static void main(String []args) {
		double radius = 4.0;
		double sideA = 3.0;
		double sideB = 4.0;
		//System.out.println("Circle w/ radius: " + radius + "\nCircumference: " + Geometry.getCircumference(radius) + "\nArea: " + Geometry.getCircleArea(radius));
		//System.out.println("Square Root of 81 = " + MathLib.getSquareRoot(81.0));
		System.out.println("Hypotenuse: " + Geometry.getHypotenuse(sideA, sideB));
		System.out.println("2^3 = " + MathLib.getNthPower(2.0, 3));
		System.out.println("Cube root of 8: " + MathLib.getNthRoot(8.0, 3));
	}
}
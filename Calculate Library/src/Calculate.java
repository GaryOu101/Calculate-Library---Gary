/*This class contains methods that perform various math operations.
 * @author Gary Ou
 * @version 9/6/18
 */
public class Calculate {
	public static int square (int number) {
	int answer;
	answer= number*number;
	return  answer;
	
	}
	public static int cube (int number) {
		int answer;
		answer= number*number*number;
		return answer;
	}
	public static double average(double number1, double number2) {
		double sum= number1 + number2;
		return sum/2;
	}
	public static double average2(double number1, double number2, double number3) {
	double sum= number1 + number2 + number3;
	return sum/3;
	
}
	public static double toDegrees(int radian) {
		int degree= radian*180;
		return degree;
		
			
	}
	public static int toRadians(int degree) {
		int radians= degree*180;
		return radians;
	}
	public static double discriminant(double coefficientA, double coefficientB, double coefficientC) {
		double discriminant= coefficientB*coefficientB-4*coefficientA*coefficientC;
		return discriminant;
	}
		public static String toImproperFrac(int whole, int numerator, int denominator) {
	int toImproperFrac= whole*numerator;
		return toImproperFrac+"/"+denominator;
		}			
		public static String toMixedNum(int numerator, int denominator){
			int toMixedNum= numerator/denominator;
			return toMixedNum+"_"toMixedNum-
		}
}

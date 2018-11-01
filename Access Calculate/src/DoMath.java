/*This class is client code that uses the Calculator Library to perform various mathematical tasks.
 * @author Gary Ou
 * @version 9/6/18
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(2,4));
		System.out.println(Calculate.average(1,2,3));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(5));
		System.out.println(Calculate.discriminant(2,3,6));
		System.out.println(Calculate.toImproperFrac(3,2,4));
	    System.out.println(Calculate.toMixedNum(7,2));
	    System.out.println(Calculate.foil(2,3,6,-7,"x"));
	    System.out.println(Calculate.isDivisibleBy(5,2));
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(3,4));
		System.out.println(Calculate.max(3,4,5));
		System.out.println(Calculate.min(3,4));
		System.out.println(Calculate.round2(5.357));
		System.out.println(Calculate.exponent(6,3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(5));
		System.out.println(Calculate.gcf(16, 24));
		System.out.println(Calculate.sqrt(144));
		System.out.println(Calculate.quadForm(3, 3, -36));
		}
	
}
/*This class is client code that uses the Calculator Library to perform various mathematical tasks.
 * @author Gary Ou
 * @version 9/6/18
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(55));
		System.out.println(Calculate.cube(55));
		System.out.println(Calculate.average(2,4));
		System.out.println(Calculate.average2(1,2,3));
		System.out.println(Calculate.toDegrees(2));
		System.out.println(Calculate.toRadians(5));
		System.out.println(Calculate.discriminant(2,3,6));
	System.out.println(Calculate.toImproperFrac(3,2,4));
}
} ok
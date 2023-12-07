/* >>>>>>> Segunda versão
package util;

public class Calculator {
	
	public final double PI = 3.14159;
	
	public double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public double volume(double radius) {
		return 3 * PI * radius * radius * radius / 3;
	}

}
 
 */

package util;

public class Calculator {
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}

}



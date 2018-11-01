
	public class Quadratic {
		
		public static double absValue(double num1) {
		
			if (num1<0) {
					return num1*(-1); // if its a negative number, we times it by -1 to make it a positive.
			}else {
					return num1;
			}
			
	}
	
	  public static double round2(double num1) {
		  
		  if (num1 >=0) {	  
		 double num2=(num1+.005)*100; //adding .005 will change the third decimal place to increment up to be 1 or 0.
		 double num3= (int)num2;      // we times by 100 to prevent the int from erasing the 2 decimal places.
		 return num3/100;             // puts the number back to original value rounded up
		  }else {
			  double num2= (num1 - .005) * 100;
			  double num3 = (int) num2;
			  return num3 / 100;
		  }
	  
	} 
	// gives the discriminant of a quadratic equation
	public static double discriminant(double coeffA, double coeffB, double coeffC) {
		
			double discriminant= coeffB * coeffB-4 * coeffA * coeffC; 
			return discriminant;
			
	}
	
	public static double sqrt (double num1) {
		
		double answer = num1/4;                    
		while ((Quadratic.absValue((answer*answer)-num1)) >= .005) { // makes difference between input and answer squared less than .005
			answer = ((num1/answer) + answer)/2; //uses newton's method formula (N/A +A)
		}
		return Quadratic.round2(answer);  //rounds to 2 decimals
		
		
	}
	
	public static  String quadForm (double a, double b, double c) {
		
		double answer = (-b+Quadratic.sqrt(Quadratic.discriminant(a, b, c))) / (2 * a); // use the quadratic equation. One for positive and one for negative
		double answer2 = (-b-Quadratic.sqrt(Quadratic.discriminant(a, b, c))) / (2 * a);
		if (answer == 0 && answer2 == 0) {  // created a condition if both values are 0, then print no real roots.
			return "no real roots";            
		}else 
			if (answer == answer2) {
			return Quadratic.round2(answer) + ""; // when roots are the same, only returns 1 value instead of two.
		}else {
			if (Quadratic.round2(answer) < Quadratic.round2(answer2)) {
			return Quadratic.round2(answer)+"and"+Quadratic.round2(answer2); // prints the lower number first
		}else {
			return Quadratic.round2(answer2)+" and "+Quadratic.round2(answer);
		}
	}
			
	}
		

	public static String quadrDescriber(double a, double b, double c) {
        String Description = "Description of the graph of \n" + "y = " + a + " x^2 + " + b + " x + " +c + "\n\n";
        String Open = "Open: \n";
        if (a >= 1) {
            Open = "Open: Up \n";
        }
        if (a < 1) {
            Open = "Open: Down \n";
        }
        if (a == 0) {
            Open = "Not a parabola. This is a straight line. \n";
        }
        double xvertex = -b/ (2 * a);
        double yvertex = a * (xvertex * xvertex) + b  *xvertex + c;

       
        String Vertex = "Vertex: (" + xvertex + ", " + yvertex + ")\n";
        String xintercepts = "x-intercept(s): " + quadForm(a,b,c) + "\n";
        String yintercept = "y-intercept: " + c + "\n";
        return Description + Open  + Vertex + xintercepts + yintercept;
    }


	}

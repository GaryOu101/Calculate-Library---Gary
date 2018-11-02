public class Quadratic {
	public static String quadForm(double a,double b, double c) {
        String answ = "something";
        double zero1;
        double zero2;
        if (discriminant(a, b, c) < 0) {
            answ = "None";
        }
        if (discriminant(a, b, c) > 0) {
            zero1 = round2((-b + sqrt(discriminant(a,b,c)))/(2*a));
            zero2 = round2((-b - sqrt(discriminant(a,b,c)))/(2* a));
            if (zero1 == zero2) {
                answ = zero1 +"";
            }
            if (max(zero1,zero2) == zero1) {
                answ = zero2 + " and " + zero1;
            }
            else {
                answ = zero1 + " and " + zero2;
            }
        }
        if (discriminant(a,b,c) == square(b)) {
            zero1 = round2(-b / 2 * a);
            answ = zero1 + "";
        }
        return answ;
    }	
		
		public static double square (double number) {
		
				double answer;         
				answer= number*number; //multiply itself 2 times
				return  answer;
		
		
			
		}
		
		// gives the discriminant of a quadratic equation
		public static double discriminant(double coeffA, double coeffB, double coeffC) {
			
				double discriminant= coeffB * coeffB-4 * coeffA * coeffC; 
				return discriminant;
			
		}
		


		
		// gives the absolute value of a number
		public static double absValue(double num1) {
			
				if (num1<0) {
						return num1*(-1); // if its a negative number, we times it by -1 to make it a positive.
				}else {
						return num1;
				}
				
		}
		
		
		//returns the higher number between two numbers
		public static double max(double num1, double num2)	{
			
				if (num1>num2) {
						return num1;     // just use
				}else {
						return num2;
				}
				
		}
		
		// overloads max method. gives larger between three numbers
		  public static double max(double num1, double num2, double num3) {
			  
		       double num1num2;
		       	if (num1>num2) {
		       			num1num2 = num1;
		       }else { 
		            	num1num2 =num2;   //we find the larger between num1 and num2 and use that larger number and compare it to num3
		       }
		       	
		       if (num1num2>num3) {
		    	   		return num1num2;
		       }else {
		            	return num3;
		       }
		       
		}
		  
	
					
		
		  
		  
		  //rounds numbers to the 2nd decimal place.
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
		 

	    	
	    	public static double sqrt (double num1) {
	    			
	    		double answer = num1/4;                    
	    		while ((Quadratic.absValue((answer*answer)-num1)) >= .005) { // makes difference between input and answer squared less than .005
	    			answer = ((num1/answer) + answer)/2; //uses newton's method formula (N/A +A)
	    		}
	    		return Quadratic.round2(answer);  //rounds to 2 decimals
	    	}
	    	
	    		

	    	
	    
    public static String quadrDescriber(double a, double b, double c) {
        String Desc = "Description of the graph of \n" + "y = " + a + " x^2 + " + b + " x + " +c + "\n\n";
        String Open = "Opens: \n";
        if (a > 0) {                       // Whenever a is positive number, opens up
        Open = "Open: Up \n";
        }
        if (a < 0) {                       // Whenever a is negative, opens down. 
        Open = "Open: Down \n";
        }
        if (a ==0) {               // no a variable  will result in bx+c which is just a line.
        Open = "Not a parabola. This is a straight line. \n";
        }
        double xvertex =-b/(2*a);         // this is the formula to find the x vertex.
        double yvertex = (a*xvertex * xvertex) + (b *xvertex) + c;     // we are plugging in back the x vertex to get the associated y vertex.

        String AxisofSym = "Axis of Symmetry: " + xvertex + "\n";
        String Vertex = "Vertex: (" + xvertex + ", " + yvertex + ")\n";
        String xInt = "x-intercept(s): " + quadForm(a,b,c) + "\n";
        String yInt = "y-intercept: " + c + "\n";
        return Desc + Open + AxisofSym + Vertex + xInt + yInt;
    }
}
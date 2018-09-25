/*This class contains methods that perform various math operations.
 * @author Gary Ou
 * @version 9/6/18
 */
//returns square of a number
public class Calculate {
	public static int square (int number) {
	int answer;         
	answer= number*number; //multiply itself 2 times
	return  answer;
	
	}
	//returns cube of a number
	public static int cube (int number) {
		int answer;
		answer= number*number*number; // multiply itself 3 times
		return answer;
	}
	//returns average of two numbers
	public static double average(double number1, double number2) {
		double sum= number1 + number2;              // average is adding 2 numbers / # of numbers
		return sum/2;
	}
	//returns the average of three numbers
	public static double average2(double number1, double number2, double number3) {
	double sum= number1 + number2 + number3;   //same as above but with 3 numbers
	return sum/3;
	
}
	//changes radians to degrees
	public static double toDegrees(int radian) {
		int degree= radian*180;    // 1 radian is 180 degrees
		return degree;                
		
			
	}
	//changes degrees to radians
	public static int toRadians(int degree) {
		int radians= degree*180;       // times the radian by 180
		return radians;
	}
	// gives the discriminant of a quadratic equation
	public static double discriminant(double coefficientA, double coefficientB, double coefficientC) {
		double discriminant= coefficientB*coefficientB-4*coefficientA*coefficientC; 
		return discriminant;
	}
	// turns a mixed number into an improper fraction
		public static String toImproperFrac(int whole, int numerator, int denominator) {
	int toImproperFrac= whole*numerator;
		return toImproperFrac+"/"+denominator;
		}			
		//turns a improper frac to a mixed number
		public static String toMixedNum(int numerator, int denominator){
			int toMixedNum= numerator/denominator;
			return toMixedNum+"_"+numerator%denominator+"/"+denominator;
			
					
		}
		// converts a bionomial multiplcation of (ax+b)(cx+d) into a quadratic equation
		public static String foil(int a,int b, int c, int d, String n) {
			
			return (a*c)+"n^2"+"+"+(a*d+b*c)+"n"+"+"+(b*d);
						
}
		// checks if a number is divisible by a number
		public static boolean isDivisibleBy(int num1, int num2) {
			return num1%num2==0;
		}
		// gives the absolute value of a number
			public static double absValue(double num1) {
				if (num1<0) {
					return num1*(-1); // if its a negative number, we times it by -1 to make it a positive.
					}
				else {
					return num1;
					}
			}
			//returns the higher number between two numbers
	public static double max(double num1, double num2)	{
		if (num1>num2) {
			return num1;     // just use
		}
			else {
				return num2;
			}
}
	// overloads max method. gives larger between three numbers
	  public static double max(double num1, double num2, double num3) {
	       double num1num2;
	      if (num1>num2) {
	           num1num2 = num1;
	       }
	 
	        else { 
	            num1num2 =num2;   //we find the larger between num1 and num2 and use that larger number and compare it to num3
	        }
	        if (num1num2>num3) {
	            return num1num2;
	        }
	        else {
	            return num3;
	        }
	  }
	  //gives the lowest number of the two
	  public static int min(int num1,int num2) {
	         if (num1<num2) {
	          return num1;
	              }
	         else {
	              return num2;
	        }	
				}
	  //rounds numbers to the 2nd decimal place.
	  public static double round2(double num1) {
		 double num2=(num1+.005)*100; //adding .005 will change the third decimal place to increment up to be 1 or 0.
		 double num3= (int)num2;      // we times by 100 to prevent the int from erasing the 2 decimal places.
		 return num3/100;             // puts the number back to original value rounded up
		 
	  }
	  //raises a value to a positive integer power
	  public static double exponent(double a,int b) {
		  double answer=a;
		 // loops amount of times of exponent
		  for(int exponent=1; exponent!=b; exponent++) {
		 // base times itself amount of times expression is true ( which amounts to the exponents)
			answer=answer*a;
		  }
		  return answer;
			
		
		  }
	 // returns the factorial of the value passed
	  public static int factorial(int num1) {
		  int answer=num1;
		  //when expression is true, i is incremented by 1.
		  for (int i=1;i!=num1;i++) {
			  // the value of i is multiplied by num1, then i is incremented and the icremented i is multiplied by num1.
			  answer=answer*i;
		  }
			  return answer;
			  
		  }
	  // checks if a number is a prime number
	  public static boolean isPrime(int num1) {
		  for (int i=2;i<num1;i++) {
			  // checks divisibility between 2 through num1. Does not start at 1 b/c prime can be factor of 1 and num1.
			  if (Calculate.isDivisibleBy(num1, i)){
			// checks all number for divisiblity. When isDivisbleBy is true, there is another factor of the number and thus the answer is false.
				  return false;
				  }
			  }
		  return true;
		  }
	// returns greatest common factor of two numbers
	    public static int gcf (int num1, int num2) {
            int answer = 1; // if there are no factors, the answer will be 1
                    for (int i = Calculate.min(num1, num2); i>0;i--){ // i is set to the min number, since we know the factors of min is not above it.
                        if (Calculate.max(num1, num2) % i==0 && Calculate.min(num1,num2)%i==0){ // increments down until i is a value that is divisible by both numbers.
                           
                            if (i>= answer) {  // sets i equal to answer. 
                                answer = i;       
                            }
                        }
                    }
                    return answer;
                    }
    	
    	//returns an approximation of the square root of the value
    			  
    	
    		
}
              
		  
	  
				  
			  
		 
	  
	  
		  
	 
				
			
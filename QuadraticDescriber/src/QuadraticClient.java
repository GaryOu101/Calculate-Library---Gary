import java.util.*;
public class QuadraticClient{
    public static void main(String args[]){
        System.out.println("Welcome to the Quadratic Describer");
        System.out.println("Provide values for coefficients a, b, and c");
        Scanner userInput = new Scanner(System.in);
       do {  
            System.out.print("a:");
            double a = userInput.nextDouble();        //uses a do while loop. Does the stuff inside the loop then does a condition.
            
            System.out.print("b:");
            double b = userInput.nextDouble();
            System.out.print("c:");
            double c = userInput.nextDouble();
            System.out.println(Quadratic.quadrDescriber(a, b, c));    //prints out our information that we created in Quadratic.
            System.out.println("Do you want to keep going? (Type \"quit\" to end)");
       		}
       while(!(userInput.next().equals("quit"))); // the ! makes the while condition fail and exit the loop when user types quit.

        userInput.close();
    }
}
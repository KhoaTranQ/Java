
package pythagorean.theorem;

/**
 *
 * @author trank0040
 */


import java. util. Scanner; 
//import java. lang. Math;

public class PythagoreanTheorem {

    
    public static void main(String[] args) 
    {
       double op;
       double adj;
        System.out.println("Please enter Opposite number");
        Scanner input = new Scanner (System.in);
        op = input.nextInt();
        
        System.out.println("Please enter adjacent number ");
        adj = input.nextInt();
        
      double hyp = Math.sqrt((op * op)+(adj *adj));
      
        System.out.printf(" Hypotenuse is %.2f\n", hyp);
    }
    
}

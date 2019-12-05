

package bmicalc;

/**
 *
 * @author trank0040
 */

import java. util. Scanner;
public class BMICalc {

   
    public static void main(String[] args) {
 
        
        System.out.println("please enter your Weight in pounds");
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        System.out.println("Please enter your Height in Inches");
        int h = input.nextInt();
        
        double BMI = (w*703)/(h*h);
        
        System.out.printf("BMI Standards: %.1f\n",BMI);
        
        System.out.println("Underweight: less than 18.5\n" +
                           "Normal: between 18.5 and 24.9\n" +
                           "Overweight: between 25 and 29.9\n" +
                           "Obese: 30 or greater\n");
        
        
    }
    
}

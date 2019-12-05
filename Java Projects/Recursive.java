

package recursive;

/**
 *
 * @author trank0040
 */
import java.util.Scanner;

   
public class Recursive {

   
    public static Double sum (int a)
    {
        double su = 0;
        for (int i = 1 ; i <= a; i++)
        {
           su += 1.0/i;
        }
        
        return su;
    }
    
    
  public static int asterisk (int b)
    {
        int i, j;
        for (i = 0; i <= b; i++)
        {
            for (j = 0 ; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        int k,l;
         for (k = b; k > 0; k --)
        {
            for (l = k ; l > 0 ; l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        
        return 0;
    }
   
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    System.out.println("Please Enter 1st Integer");
    int a = input.nextInt();
    double s = sum(a);
    System.out.printf("sum = %.2f\n", s);
    
    System.out.println("Please Enter 2nd integer");
    int b = input.nextInt();
    asterisk(b);
    
    
}
}

package ispalindrome;

import java.util.Scanner;
public class IsPalindrome {

    
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.println("Please input String");
        boolean continueloop = true;
        String r;
        
        do
        {
            try
            {
                String input = in.nextLine();
                
                if (input.matches("[^0-9A-Z]+"))
                {
                    System.out.println("Original String: "+input);
                    String l= input.replaceAll("[\\W]", "");//ignore whitespace and punctuation for user input
                    r = Reverse(input);
                    String rr = r.replaceAll("[\\W]", ""); //ignore whitespace and punctuation for reverse
                    System.out.println("Reverse String: "+r);
                    
                    if (l.equals(rr))
                       System.out.println("String is a palindrome.");
                    else
                       System.out.println("String is not a palindrome.");
                    continueloop = false;
                }
                
                else
                    throw new Exception("String cannot contain numbers or Capital Letters");
                  
            }
            
                catch (Exception e)
                    {
                       System.err.println(e); 
                       System.out.println("Please input String again");
                    }
                
                
        }while (continueloop);
        
        
        
    }
    
    public static String Reverse (String re)
    {
       int length = re.length();
       String reverse = "";
       for ( int i = length - 1 ; i >= 0 ; i-- )
       {
        reverse = reverse + re.charAt(i);     
       }
       return reverse;
    }
    
}

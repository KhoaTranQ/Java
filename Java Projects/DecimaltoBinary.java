
package decimaltobinary;

/**
 *
 * @author trank0040
 */

import java.util.Scanner;
public class DecimaltoBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Please enter your decimal");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
       
        
        int binary[] = new int[64];
        int c = 0;
        while(number > 0){
            binary[c++] = number%2;
            number = number/2;
        }
        
        for(int i = c -1;i >= 0;i--){
            System.out.print(binary[i]);
        }

        System.out.println("");
        
    }
    
}

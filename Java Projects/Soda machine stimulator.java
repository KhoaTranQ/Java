package soda;

import java. util. Scanner;
/**
 *
 * @author trank0040
 */
public class Soda {

    public static void main(String[] args) {
       
        System.out.println("Hello\n");
      
         System.out.println("Brand of soda\n");
         System.out.println("Soda 1 = $1");
         System.out.println("Soda 2 = $1");
         System.out.println("Soda 3 = $1");
         System.out.println("Soda 4 = $1");
         System.out.println("Soda 5 = $1");
         System.out.println("Soda 6 = $1");
      
         System.out.println("Machine only take $1 and $5\n");
         System.out.println("Please insert cash\n");
         Scanner input = new Scanner(System.in);
         int cash = input.nextInt();
        
         
         while (cash == 1)
         {
          System.out.printf("you put in $%d \n", cash);
             System.out.println("Please use number 1 - 6 to pick your soda");
             int soda = input.nextInt();
              System.out.printf("you pick soda %d\n", soda);
               
              if (soda >= 7)
              {
                  System.out.println("Invalid choice please choose again \n");
                  break;    
              }
              
              else 
              {
                  System.out.println("Thank you, here is your soda and $0 changes");
                 break;
              }
         }
         
          while(cash == 5)
         {
          System.out.printf("you put in $%d \n", cash);
             System.out.println("Please use number 1 - 6 to pick your soda");
             int soda = input.nextInt();
              System.out.printf("you pick soda %d \n", soda);
               
              if (soda >= 7)
              {
                  System.out.println("Invalid choice please choose again \n");
                  break;        
              }
              else 
              {
                  System.out.println("Thank you, here is your soda and $4 changes");
                 break; 
              }
         }
         
         while (cash != 1 || cash != 5 )
          {
              break;
          }

    }
    
}

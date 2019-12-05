package javasorttest;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author trank0040
 */
public class JavaSortTest {
    public static void main(String[] args) 
    {
       System.out.println("1)BubbleSort\n" +
                            "2)InsertionSort\n" +
                            "3)ShellSort\n" +
                            "4)MergeSort\n" +
                            "5)QuickSort");
        Scanner input = new Scanner(System.in);
        System.out.println("please pick a number from 1-5 to pick a sorting method");
         
         int s = input.nextInt();
         //int high = 98;
          Random r = new Random();
          int []a;
          
            a = new int[13];
          
            System.out.println("Original Array:");
          for ( int i = 0; i < a.length; i++ )
          {
              a[i] = r.nextInt(98)+ 1; //random from 1-99
              System.out.print("["+a[i]+"]");
          }
          System.out.print("\n");
         
          
        if (s == 1) 
        {
          System.out.println("For each Pass");
          JavaSort.BubbleSort(a);
          printv(a);
        } 

         if (s == 2)
        {
           System.out.println("For each Pass");
           JavaSort.InsertionSort(a);
           printv(a);  
        }
         
        if (s == 3)
        {
          System.out.println("For each Pass");
          JavaSort.ShellSort(a);
          printv(a);
        }
        
        if (s == 4)
        {
          System.out.println("For each Pass");
          JavaSort.MergeSort(a);
          printv(a);
        }
        
        if (s == 5)
        {
          System.out.println("For each Pass");
          JavaSort.QuickSort(a);
          printv(a);
        }
        
            
    }
    
    
    public static void printv(int a[])
    {
        System.out.println("Sorted Array:");
         for ( int i = 0; i < a.length; i++ )
          {
              
              System.out.print("["+a[i]+"]");
          }
         System.out.print("\n");
    }
    
    
    
}

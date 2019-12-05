

package javasorttest;

import java.util.Arrays;

/**
 *
 * @author trank0040
 */
public class JavaSort {
      static void BubbleSort (int []a)
  {
     
     
     for (int i = 0; i < a.length; i++)
        {
            for(int j = 1 ; j < a.length; j++)
            {
                if (a[j-1] > a[j])
                {
                    swap (a,j-1,j);
                    
                }
              System.out.print(Arrays.toString(a));                       
            }
            System.out.print("\n");
        }
     
     
  }
  
  static void InsertionSort (int a[])
  {
      for (int k = 0; k <a.length; k++)
      {
       for (int i = 0; i < a.length; i++) 
       {  
            int v = a[i];  
            int j = i - 1;  
            while (j >= 0 && a[j] > v) 
            {  
                a[j + 1] = a[j];  
                j = j - 1;  
            }  
           System.out.print(Arrays.toString(a)); 
                a[j + 1] = v;
         
       }
        System.out.print("\n");
      }
  }
  
  
  static void ShellSort ( int []a)
  {
        int h = 1;
        while (h < a.length) h = 3*h + 1;{
      
  
            while (h > 0){
            h = h/3;
            for (int k = 0; k < h; k++)
            {
                for (int i = h+k; i < a.length; i+=h)
                {
                    int key = a[i];
                    int j = i-h;
                    while (j>=0 && a[j] > key)
                    {
                        a[j+h] = a[j];
                        j-=h;
                    }
                    a[j+h] = key;
                    System.out.print(Arrays.toString(a)); 
                }
               
                 System.out.print("\n");
            }
            }
        }
        
  }
  static void MergeSort (int a [])
  {
      if (a.length > 1) 
      {
            int[] left = leftHalf(a); //split the lefthalf
            int[] right = rightHalf(a); //split the righthalf 
            MergeSort(left); //sort the lefthalf
            MergeSort(right); //sort the lefthalf
            
       
           
        int i1 = 0;   
        int i2 = 0;   
    for (int i = 0; i < a.length; i++) 
        {
            if (i2 >= right.length || (i1 < left.length && 
                    left[i1] <= right[i2]))
            {
                a[i] = left[i1];    
                i1++;
            } else 
            {
                a[i] = right[i2];   
                i2++;
            }
            System.out.print(Arrays.toString(a)); 
            
        }
            System.out.print("\n");
      }
  }  
    static int[] leftHalf (int[] array) 
    {
        int size1 = array.length / 2;
        int[] left = new int[size1];
         for (int i = 0; i < size1; i++) 
         {
            left[i] = array[i];
         }
        return left;
    }

     static int[] rightHalf (int[] array)
     {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) 
        {
            right[i] = array[i + size1];
        }
        return right;
    }
    
     
  static void QuickSort (int a[])  
  {
      quicksort(a, 0, a.length - 1);
  }
     
  static void quicksort (int a[], int start,int end)
  {
      
      int s = start;
      int e = end;
       
    if (end - start >= 1)                  
        {
                int pivot = a[start];       
                while (e > s)                   
                {
                        while (a[s] <= pivot && s <= end && e > s)  
                                s++;                                    
                        while (a[e] > pivot && e >= start && e >= s) 
                            e--;                                     
                        if (e > s)  
                        
                            swap(a, s, e);  
                        System.out.print(Arrays.toString(a)); 
                }
               
                 System.out.print("\n");
                swap(a, start, e);         
                                             
               quicksort(a, start, e - 1); 
               quicksort(a, e + 1, end);  
               
        }
    }
  
  static void swap(int array[], int i, int j) 

{
	int temp = array[i];           
	array[i] = array[j];      
	array[j] = temp;               
}
  

}

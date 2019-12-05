
/*
     a. PROGRAMMER: Khoa Tran

     b. COURSE:   CSCI 3321

     c. DATE:   Febuary 18, 2015

     d. ASSIGNMENT:  2

     e. ENVIRONMENT: Window 7


     g. PURPOSE: DConstruct a computer program that uses the Secant Method to solve the problem:
                     f(x)  =  x  *  exp(-x) -  0.01   =  0

     h. INPUT:  x = -1 and x = 2

     i. PRECONDITIONS:  Starting with the initial guesses of x = -1 and x = 2,  obtain an approximation to x such that  |f(x)| < 0.0000001.  

     j. OUTPUT: On your output, show the iteration number (n), the approximate value of x on the nth iteration (xn), and the value of f(xn).

     k. POSTCONDITIONS: None

     l. ALGORITHM:  Secant algorithm

  
 */


package secant;

/**
 *
 * @author trank0040
 */

import java. util.*;
public class Secant {


    public static void main(String[] args) {
        
    double  x = -1, x1 = 2;
    x = secant(x,x1);
    
    System.out.println("x(n) = " + x);
    System.out.println("fx(n) = " + f(x));   
    }      
    

    // secant method = xi - ((FXi *(Xi - (Xi-1)) /(FXi - (FXi-1)))
    
    public static double secant (double x,double x1) 
    {
        int n = 0;
        double x2 = 0;

        while ((Math.abs(f(x2))> 0.0000001))
        {
            double d = f(x1)-f(x);
            x2 = x1-f(x1)*(x1-x)/d;
            x  = x1; // making it so the value change for the loop
            x1 = x2;
            n++;
            
        }
        
        System.out.println("nth = " + n);  
        
        return x1;
        }

//create function f(x) = x *exp(-x) - 0.01 = 0;
    public static double f(double x) 
    {
        return x * Math.exp(-x) - 0.01;
    }
    
    
    
}
            

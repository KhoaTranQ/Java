/*
     a. PROGRAMMER: Khoa Tran

     b. COURSE:   CSCI 3321

     c. DATE:   April 14, 2015

     d. ASSIGNMENT:  3

     e. ENVIRONMENT: Window 7


     g. PURPOSE: Design and construct a computer program in one of the approved languages (C, C++, Java, Pascal, etc.) that will illustrate the use of a third-order 
explicit Runge-Kutta method of your own design.  In other words, you will first have to solve the Runge-Kutta equations of condition for a third-order 
method.

     h. INPUT:    x'(t) =  x cos(t + x)

     i. PRECONDITIONS:  subject to the initial condition:  x(0) = 1.0


     j. OUTPUT:  For each run, print out the value of h and then a table of t and x.  
The true solution of this differential equation resembles the following plot of x(t) as a function of t. 


     k. POSTCONDITIONS: None

     l. ALGORITHM:  third-order 
explicit Runge-Kutta 

  
 */


package runge;

/**
 *
 * @author trank0040
 */





public class Runge {

   
    public static void main(String[] args) {
      
       double x0 = 1.0;
        // mul by 2 each run
        // div by 2 each run stepsize of x
       
       
       double a1 = 1.0/3.0;
       double a2 = 1.0/2.0;
       double c1 = -3.0/2.0;
       double c2 = 2.0;
       double c0 = 1.0/2.0;
       double b10 = a1;
       double b20 = 1.0/4.0;
       double b21 = 1.0/4.0;
       
     
       
       
     
     double t0 = 0;
    
     
    for (double t = 30.0; t <= 1920.0 ; t *= 2) 
        {    
          System.out.print("steps = "+ t0+ " to "+ t + "\n" );
           
          
           for ( double h = 1.0; h >= 0.015625 ; h/= 2)
                    
                {  
                    
                   for (double r = 0; r < t ; r++)
                  {
                      
                      
                      double x1 = x0 + h* b10 * f(t0,x0);
                      double x2 = x0 + h* (b20 * f(t0,x0) + b21* f(t0 + a1*h,x1));
                      double x3 = x0 + h* (c0* f(t0,x0)) + (c1*f(t0+ a1*h,x1)) + (c2 * f(t0 + a2*h,x2));

                    x0 = x3;
                    t0 = t0 + h; 
                    
                  }
                   
                    System.out.print("X = "+ x0 + " ~~ ");
                    System.out.print("h = " + h + " \n");
                    t0 = t;
                }

            
            System.out.println();

            
           
            

        }

    }
    



//create function   x'(t) =  x cos(t + x)
    public static double f(double t, double x) 
    {
        return x*(Math.toRadians(Math.cos(t + x)));
    }
    
    
}

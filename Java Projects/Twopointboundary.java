/*
     a. PROGRAMMER: Khoa Tran

     b. COURSE:   CSCI 3321

     c. DATE:   April 14, 2015

     d. ASSIGNMENT:  4

     e. ENVIRONMENT: Window 7

     g. PURPOSE:Construct a computer program that uses both the secant  method and the Runge-Kutta method to obtain a numerical solution to the two-point boundary-value

     h. INPUT:   x' = f(t,x) = x + 0.09 x^2 + cos(10 t) differential equation
                        x(0) + x(1) - 3.0 = 0            boundary condition

     i. PRECONDITIONS: 
            Starting with the initial guesses 0.7 and 1.0 for the (unknown) initial value, x(0)


     j. OUTPUT:  obtain an approximation to x(0) {for the final solution, x(t)} such that the boundary condition is satisfied to within a tolerance of 10-4 a function of t. 


     k. POSTCONDITIONS:  Use a fixed stepsize of 0.025 (i.e., take 40 steps each time you integrate the differential equation from t=0 to t=1)

     l. ALGORITHM:  third-order 
explicit Runge-Kutta, secant

  
 */
package twopointboundary;

/**
 *
 * @author trank0040
 */
public class Twopointboundary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double x0 = 0.7;

       
       
       double a1 = 1.0/3.0;
       double a2 = 1.0/2.0;
       double c1 = -3.0/2.0;
       double c2 = 2.0;
       double c0 = 1.0/2.0;
       double b10 = a1;
       double b20 = 1.0/4.0;
       double b21 = 1.0/4.0;
       
       
       for (double i = 0.7; i <= 1; i+= 0.3)
       { 
           
           x0 = i;
           for ( double h = 0; h < 1.025 ; h += 0.025)
                    
                {  
                        
                    double x1 = x0 + h* b10 * f(h,x0);
                    double x2 = x0 + h* (b20 * f(h,x0) + b21* f(h + a1*h,x1));
                    double x3 = x0 + h* (c0* f(h,x0)) + (c1*f(h+ a1*h,x1)) + (c2 * f(h + a2*h,x2));
                      
                    
                    
                    
                     
                   System.out.println("X(0) " + x0); 
                   System.out.println("x(1) " + x3); 
                   System.out.println("boundary " + f1(x0,x3));
                   
                    
                    
                   x0 = Math.abs(secant(x0,x3,h));
                    
                }        
                System.out.println();  
          

       }
           
       
    }
    

     public static double secant (double x,double x1 ,double h) 
    {

        double x2;
        
    
            double d = f(x1,h)-f(x,h);
            x2 = x1 - f(x1,h)*(x1-x)/d;
            
             

        return x2;
        }
     
     
      public static double f(double t, double x)
    {
        
        return (x +(0.09*(x*x)) + Math.toRadians(Math.cos(10*t)));
    }
      
      
      public static double f1(double x, double x1)
      {
          return x + x1 - 3;
      }
      
}

import java.lang.Math;

public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c; 
    }

  
    public static double expSum(double x) {
     
        double a = x;
        double b = Math.exp(-x);

        
        double c = Math.sqrt(1 - Math.exp(-x));

        return multadd(a, b, c);
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 4.6 Hesaplamaları ---");
        
        System.out.println("\nBasit multadd Testi (2.0 * 3.0 + 4.0 = 10.0):");
        double testResult = multadd(2.0, 3.0, 4.0);
        System.out.println("Sonuç: " + testResult);


        System.out.println("\n1. İfade: sin(π/4) + cos(π/4)/2");
      
        double a1 = 0.5;
        double b1 = Math.cos(Math.PI / 4.0);
        double c1 = Math.sin(Math.PI / 4.0);
        
     
        double result1 = multadd(a1, b1, c1);
        System.out.println("Sonuç: " + result1);

  
        System.out.println("\n2. İfade: log 10 + log 20");
       
        
       
        double a2 = 1.0;
        double b2 = Math.log(10.0);
        double c2 = Math.log(20.0);
        
     
        double result2 = multadd(a2, b2, c2);
        System.out.println("Sonuç: " + result2); 

       
        double xTest = 3.0; 
        System.out.println("\nexpSum(" + xTest + ") Testi:");
        double resultExpSum = expSum(xTest);
        System.out.println("x * e^(-x) + sqrt(1 - e^(-x)) = " + resultExpSum);
        
        System.out.println("\n--- Hesaplamalar Tamamlandı ---");
    }
}

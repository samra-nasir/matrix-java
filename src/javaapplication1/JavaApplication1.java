/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Samra
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int m, n, p, q, c, d;
 
      Scanner in = new Scanner(System.in);
      Random r = new Random();
      abc s = new abc();
      System.out.println("Enter the number of rows and columns of first matrix");
      m = in.nextInt();
      n = in.nextInt();
 
      int first[][] = new int[m][n];
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            first[c][d] = r.nextInt(100);
 
      System.out.println("Enter the number of rows and columns of second matrix");
      p = in.nextInt();
      q = in.nextInt();
 
      if ( n != p )
         System.out.println("Matrices with entered orders can't be multiplied with each other.");
      else
      {
         int second[][] = new int[p][q];
 
         for ( c = 0 ; c < p ; c++ )
            for ( d = 0 ; d < q ; d++ )
               second[c][d] = r.nextInt(100);

        int result[][] = s.multiply(first, second);
        int result2[][] = s.multiply2(first,second,m,q,p);
 
         
         System.out.println("Result by strassen algorithm:");
 
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
              System.out.print(result[c][d]+"\t");
 
            System.out.print("\n");
         }
         
         System.out.println("\nResult by traditional method:");
         for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
              System.out.print(result2[c][d]+"\t");
 
            System.out.print("\n");
         }
      }
    }
    
    
}
    
    
   

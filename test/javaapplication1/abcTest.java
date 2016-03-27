/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samra
 */
public class abcTest {
    
    public abcTest() {
    }


    /**
     * Test of multiply method, of class abc.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{4,3},{2,1}};
        int[][] expResult = {{8,5},{20,13}};
        int[][] result = abc.multiply(A, B);
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of multiply2 method, of class abc.
     */
    @Test
    public void testMultiply2() {
        System.out.println("multiply2");
        int[][] a = {{1,2},{3,4}};
        int[][] b = {{4,3},{2,1}};
        int[][] expResult = {{8,5},{20,13}};
        int m = 2;
        int q = 2;
        int p = 2;
        int[][] result = abc.multiply2(a, b, m, q, p);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of both methods method, of class abc.
     */
    @Test
    public void testEquality() {
        System.out.println("equality");
        int[][] a = {{10,20},{30,40}};
        int[][] b = {{40,30},{20,10}};
        int m = 2;
        int q = 2;
        int p = 2;
        int[][] result2 = abc.multiply2(a, b, m, q, p);
        int[][] result = abc.multiply(a, b);
        assertArrayEquals(result2, result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author gayatri
 */
public class _28diffBWsumofsqrandsquareofsum {
    public static void main(String[] ar) {
        int n = 3;
        int sumOfNatural = (n * (n + 1)) / 2;
        sumOfNatural=sumOfNatural*sumOfNatural;
        int sumOfSquare = (n * (n + 1) * (2 * n + 1)) / 6;

        System.out.println("Sum of natural numbers: " + sumOfNatural);
        System.out.println("Sum of squares of natural numbers: " + sumOfSquare);
                System.out.println(sumOfNatural-sumOfSquare);

        
    }
}

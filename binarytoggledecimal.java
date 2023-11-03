/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.Scanner;
/**
 *
 * @author gayatri
 */
public class binarytoggledecimal {
    




    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        
        int toggledDecimal = toggleRightmostBits(n);
        System.out.println("Toggled Decimal: " + toggledDecimal);
    }
    
    public static int toggleRightmostBits(int n) {
        int binary = toBinary(n);
        int toggledBinary = toggleRightmost(binary);
        int decimal = binaryToDecimal(toggledBinary);
        return decimal;
    }
    
    public static int toBinary(int n) {
        int binary = 0;
        int placeValue = 1;
        
        while (n > 0) {
            int remainder = n % 2;
            binary += remainder * placeValue;
            placeValue *= 10;
            n /= 2;
        }
        
        return binary;
    }
    
    public static int toggleRightmost(int b) {
        return b ^ 1; // Toggle the rightmost bit by using XOR (^) with 1
    }
    
    public static int binaryToDecimal(int c) {
        int decimal = 0;
        int placeValue = 1;
        
        while (c > 0) {
            int remainder = c % 10;
            decimal += remainder * placeValue;
            placeValue *= 2;
            c /= 10;
        }
        
        return decimal;
    }
}

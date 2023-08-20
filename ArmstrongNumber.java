/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;

/**
 *
 * @author gayatri
 */
public class ArmstrongNumber {
    


    public static void main(String[] args) {
        int number = 153; // Replace with the number you want to check
        boolean isArmstrong = isArmstrongNumber(number);
        
        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        int numDigits = countDigits(num);
        
        while (num > 0) {
            int digit = num % 10;
            sum += power(digit, numDigits);
            num /= 10;
        }
        
        return sum == originalNum;
    }
    
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    
    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

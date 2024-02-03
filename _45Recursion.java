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
public class _45Recursion {

    public static void main(String[] a) {
     //   print(1);
     System.out.print(fibo(4));

    }

//    static void print(int n) {
//        if (n == 5) {
//            System.out.print(5);
//            return;
//        }

//        System.out.print(n);
//        print(n + 1);
//    }
    
    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        
        return fibo(n-1)+fibo(n-2);
    }
}

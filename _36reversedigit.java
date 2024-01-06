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

public class _36reversedigit {
    public static void main(String []ar){
        int num=123;
     int ans=   reverse(num);
     System.out.println(ans);
    }
    public static int reverse(int num){
        int res=0;
     while(num>0){
         res=res*10+num%10;
         num=num/10;
     }
     return res;
}
}

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
public class _23Palindrome {
    public static void main(String []ar){
        int num=121,r,s=0;
        int c=num;
        while(num>0){
            r=num%10;
            s=(s*10)+r;
            num=num/10;
        }
        if(c==s){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
    }
}

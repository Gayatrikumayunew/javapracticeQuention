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
public class _27sumofdigit {
    public static void main(String []ar){
        int n=645;
        int r=0;
        int ans=0;
        while(n !=0){
            ans=ans+n%10;
            n=n/10;
            
        }
        System.out.println(ans);
    }
}

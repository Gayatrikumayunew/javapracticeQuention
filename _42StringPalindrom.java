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
public class _42StringPalindrom {
    public static void main(String[]ar){
        String str="aba";
        System.out.println(IsPalindrome(str));
        
    }
    public static boolean IsPalindrome(String a){
        if( a==null ||a.length()==0 ){
            return true;
        }
        a=a.toLowerCase();
        for(int i=0;i<a.length()/2;i++){
            
        
        char start=a.charAt(i);
        char end=a.charAt(a.length()-1);
        if(start !=end){
            return false;
        }
//        start++;
//        end--;
//        
        
        }
        return true;
    }
}

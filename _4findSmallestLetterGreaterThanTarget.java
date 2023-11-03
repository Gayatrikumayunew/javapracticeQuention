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
public class _4findSmallestLetterGreaterThanTarget {
    public static void main(String [] args){
        char [] letters={'c','e','f','g'};
       char target ='h';
       char ans =nextGreatestLetter(letters,target);
       System.out.print(ans);
        
    }
  static  public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        if(start ==letters.length){
            return letters[0];
        }
        while(start>=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid +1;
            }
        }
        
    return letters[start];
}
}

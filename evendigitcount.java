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
public class evendigitcount {
    public static void main(String[]ar){
        int[] arr={12,45,4658,155};
        int ans=findNumber(arr);
        System.out.println(ans);
        
    }
    //creatind function
    public static int findNumber(int []arr){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
            
        }
        return count;
    }
    // creatinf even function to know is index value is even or not
    public static boolean even(int num){
        int number=digits(num);
        if(number%2==0){
            return true;
        }
        return false;
    }
    // creating function to know no of digits in array
    public static int digits(int sum){
        int c=0;
        while(sum>0){
            c++;
            sum=sum/10;
        }
        return c;
    }
}

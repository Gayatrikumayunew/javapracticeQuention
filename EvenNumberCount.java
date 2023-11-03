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
public class EvenNumberCount {
    public static void main(String [] args){
        int nums[]={12,345,2,6,7896,-11};
        System.out.println(findNumbers(nums));
        
    }
    static int findNumbers(int[] nums){
        int count =0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //first we count the number 
    
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count ++;
            num=num/10;
        }
        return count;
    }
    // after count we checking is it even or not
    static boolean even(int num){
        int numdigit=digits(num);
        if(numdigit %2 ==0){
            return true;
        }
        return false;
    }
}

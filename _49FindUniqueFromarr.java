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
public class _49FindUniqueFromarr {
    public static void main(String []ar){
        int []arr={2,3,3,4,6,5,2,4,5};
        System.out.println(ans(arr));
    }
    static int ans(int arr[]){
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }
        return unique;
    }
}

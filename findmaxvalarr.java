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
public class findmaxvalarr {
    public static void main(String[]ar){
        int arr[]={14,45,87,66,2};
        int maxval=maxfun(arr);
        System.out.println(maxval);
    }
    public static int maxfun(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}

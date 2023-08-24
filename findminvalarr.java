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
public class findminvalarr {
    public static void main(String[] ar){
        int arr[]={12,5,2,8,9};
        int min=minfind(arr);
        System.out.print(min);
    }
    public static int minfind(int arr[])
    {
        int minval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minval){
                minval=arr[i];
                
            }
        }
        return minval;
    } 
}

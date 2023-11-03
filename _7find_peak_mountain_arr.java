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
public class _7find_peak_mountain_arr {
    public static void main(String [] ar){
        int arr[]={1,2,5,8,6,3,0};
        int ans=binary(arr);
        System.out.print(ans);
    }
    static int binary(int []arr){
         int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }
        
        }
        return start;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Arrays;

/**
 *
 * @author gayatri
 */
// find the largest element then swap to last again find largest index then swap to second largest
public class _11selection_Sort {
    public static void main(String [] ar){
        int arr[]={4,7,55,2,6};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void selection(int arr[]){
        for(int i=0; i<arr.length-1;i++){
            int last=arr.length-i-1;
            int max=findmaxindex(arr,0,last);
            swap(arr,max,last);
            
            
        }
    }
    static void swap (int arr[],int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    private static int findmaxindex(int arr[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]< arr[i]){
                max=i;
            }
        }
        return max;
    }
}

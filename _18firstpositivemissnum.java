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
public class _18firstpositivemissnum {
    public static void main(String []ar){
        int arr[]={1,2,-1,0,3};
    int a=    ans(arr);
        System.out.println(a);
    }
    static int ans(int arr[]){
    int i=0;
   while(i<arr.length){
    int correct=arr[i]-1;
    if(arr[i]>0 && arr[i] <=arr.length && arr[i] != arr[correct]){
        swap(arr,i,correct);
    }
    else{
        i++;
    }
}
   for(int index=0;index<arr.length;index++){
       if(arr[index] !=index+1){
           return index+1;
       }
   }
   return arr.length+1;
}
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
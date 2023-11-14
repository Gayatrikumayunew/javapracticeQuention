/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Arrays;
import java.util.List;
import static javapractice._16FindallDuplicatesinArr.sort;

/**
 *
 * @author gayatri
 */
public class _17setMAtch {
 public static void main(String [] ar){
     int arr[]={1,4,2,2};
  int []ans = sort(arr);
 
 System.out.println(Arrays.toString(ans));

 }
 static int []sort(int []arr){
     int i=0;
     while( i <arr.length){
         int correct=arr[i]-1;
         if(arr[i] !=arr[correct]){
             swap(arr,i,correct);
         }else{
             i++;
         }
             }
     for(int index=0;index<arr.length;index++){
         if(arr[index] != index+1){
             return new int [] {arr[index],index+1};
        }
     
       
         
     }
         return new int[] {-1,-1};
    
 }
    static void swap(int arr[],int first,int second){
           int temp=arr[first];
           arr[first]=arr[second];
           arr[second]=temp;
     }
}

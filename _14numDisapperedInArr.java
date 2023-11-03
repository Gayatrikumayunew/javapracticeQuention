/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author gayatri
 */
public class _14numDisapperedInArr {
    public static void main(String [] a){
        int arr[]={4,3,2,7,8,2,3,1};
//    
        List<Integer> missingValues = sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Missing Values: " + missingValues);

    }
    static List<Integer> sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
             if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
           }
        }
        List<Integer> ans=new ArrayList();
        for(int index=0;index<arr.length;index++){
            if(arr[index] != index+1){
                ans.add(index+1);
            }
            
        }
        return ans;
    }
             static void swap(int[] arr,int first,int second){
                   int temp = arr[first];
               arr[first] = arr[second];
               arr[second] = temp;
    }
             }
    


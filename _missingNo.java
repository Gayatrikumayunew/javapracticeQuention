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
public class _missingNo {

    public static void main(String[] ar) {
       int arr[] = {0, 1, 3};
       int num= sort(arr);
       System.out.print(num);
       
       
    }

    static int sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for(int index=0; index<arr.length; index++){
            if(arr[index] != index){
                return index;
            }
            
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
   }

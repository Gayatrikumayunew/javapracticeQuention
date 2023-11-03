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
public class _12insertionsort {
public static void main(String[] ar){
    int arr[]={4,6,-4,0,2,84,5};
    insertion(arr);
    System.out.println(Arrays.toString(arr));}
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
//            swap(arr,j,j-1);
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    
                  arr[j - 1] = temp;
                } else {
                    break;
                }
            }

        }

    }

}



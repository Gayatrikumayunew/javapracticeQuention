/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;

import java.util.Arrays;


public class reversearr {
    public static void main(String[] ar) {
        int arr[] = {5, 7, 8, 6, 2};
        System.out.println("Original array: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;//index value
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

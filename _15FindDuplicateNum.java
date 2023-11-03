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
//leetcode medium 287
public class _15FindDuplicateNum {

    public static void main(String[] ar) {
        int arr[] = {1, 3, 3, 2, 4};
        int ans = sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }

    static int sort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }

            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

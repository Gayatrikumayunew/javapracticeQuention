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
public class _48RotateArrOne {

    public static void main(String[] ar) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr, arr.length);
        
        // Print the rotated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int arr[], int n) {
        // Store the first element to be moved to the end
        int last_el = arr[arr.length - 1];

        // Shift each element to the right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the beginning
        arr[0] = last_el;
    }
}

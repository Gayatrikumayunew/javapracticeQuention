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
public class _20arrayave {
    static int avg(int arr[]){
                if (arr.length == 0) {
            // Handle the case where the array is empty
            // You can return a special value or throw an exception
            System.err.println("Error: Array is empty.");
            return -1; // Special value indicating "Not a Number"
            // Alternatively, you can throw an exception, for example:
            // throw new IllegalArgumentException("Array is empty");
        }


        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans+arr[i];
        }
        return ans/arr.length;
    }
    public static void main(String [] ar){
        int arr[]={};
        int a=avg(arr);
        System.out.println(a);
    }
}

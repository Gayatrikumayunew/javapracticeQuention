/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;

import java.util.Arrays;

/**
 *
 * @author gayatri
 */
public class swaparrindex {
    public static void main(String[]rs){
        int[] arr={4,1,2,6,8};
        swap(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr,int index1,int index2){
        int temp= arr[index1];
       arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}

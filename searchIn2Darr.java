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
public class searchIn2Darr {
    public static void main(String[] ar){
        int arr[][]={
            {4,2,6},
            {15,12,87},//87 in col no 2 of row 1
            {78,1,0}
        };
        int target=87;
        int[]ans=search(arr,target);
        System.out.print(Arrays.toString(ans));
    }
    public static int[] search(int arr[][],int target){
        for(int row=0;row<arr.length;row++)
        {
           for(int col=0;col<arr[row].length;col++)
           {
               if(arr[row][col]==target)
               {
                   return new int[]{row,col};
               }
           }
        }
        return new int[]{-1,-1};
    }
}

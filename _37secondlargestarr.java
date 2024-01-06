/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.*;
import java.util.Collections;

/**
 *
 * @author gayatri
 */
public class _37secondlargestarr {
    public static int second(int[]arr){
    Arrays.sort(arr);
    
    return arr[arr.length-2];
}
    
    public static void main(String []ar){
        int arr[]={45,12,67,14,25};
        int arrans=second(arr);
        System.out.println((arrans));
    }
}

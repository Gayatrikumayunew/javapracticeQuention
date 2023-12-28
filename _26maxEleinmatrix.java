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
public class _26maxEleinmatrix {
    static int max(int arr[][]){
        int maxvalue=0;
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]>maxvalue){
                maxvalue=arr[i][j];
            }
        }}
        return maxvalue;
    }
 public static void main(String []ar){
     int arr[][]={{1,2,3},{4,5,16},{7,8,9}};
     System.out.println(max(arr));
 }   
}

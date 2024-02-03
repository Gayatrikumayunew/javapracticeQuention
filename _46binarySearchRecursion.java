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
public class _46binarySearchRecursion {
    public static void main(String [] ar){
        int arr[]={1,5,10,15,25};
        int target=5;
       System.out.println( search(arr,target,0,arr.length-1));
       
    }
    static int search(int arr[],int target,int s,int e  ){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        else{
            return search(arr,target,m+1,e);
        }
    }
}

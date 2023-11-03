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
// return index;
public class _1binarysearcg {
    public static void main(String [] args){
        int arr[]={1,2,3,4,5,7,9};
        int target=3;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    static int binarysearch(int [] arr ,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
//            int mid=(start+end)/2;// it might be possible that start and end are very big number and can be out of range of int
         int mid= start+(end-start)/2;
         if(target>arr[mid]){
             start=mid+1;
         }
        else if(target <arr[mid]){
             end=mid-1;
         }
        else{
            return mid;
        }

        }
        return -1;
    }
}

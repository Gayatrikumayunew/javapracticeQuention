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
public class _2orderIgnoisticBinarySearch {
    public static void main(String [] args){
        int[] arr={0,-1,2,15,22,33,32};
        int target=-1;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
        
    }
    static int binarysearch(int arr[],int target){
   int start=0;
   int end=arr.length-1;
   // finding order or array
   boolean isAsc;
   if(arr[start]<arr[end]){
       isAsc =true;
       
   }
   else{
       isAsc =false;
   }
   while(start<=end){
       int mid=start+(end-start)/2;
       if(arr[mid]==target){
           return mid;
       }
     if(isAsc){
         if(target<arr[mid]){
             end=mid-1;
         }
         else if(target>arr[mid]){
             start=mid+1;
         }
         }  
     else{
            if(target<arr[mid]){
                start=mid+1;
            } 
            else if(target> arr[mid]){
                end=mid -1;
            }
         }     
     
   }
   return -1;
    
}
}

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
public class _8Rotated_array {
    public static void main(String [] args){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(findpivot(arr));
        int ans=search(arr,22);
        System.out.println(ans);
        
    }
    static int search(int []arr,int target){
        int pivot=findpivot(arr);
        if(pivot==-1){
            return binary(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binary(arr,target,0,pivot-1);
        }
        return binary(arr,target,pivot+1,arr.length-1);
    }
    static int binary(int arr[],int target,int start,int end){
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }
        else if(target >arr[mid]){
            start=mid+1;
        }else{
            return mid;
        }
    }
    return -1;
}
    static int findpivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // 4 cases;
            if(mid<end &&arr[mid]>arr[mid+1])//maybe possible our mid at last index
            {
                return mid;
            }
            if(mid >start &&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}

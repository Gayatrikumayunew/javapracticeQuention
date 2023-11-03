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
public class _4floorOfNo {
     public static void main(String [] args){
        int []arr={2,22,23,45,56,78};
        int target=155;
        int ans= findfloor(arr,target);
        System.out.print(ans);
    
    }
    static int findfloor(int []arr, int target){
        if(target<arr[0]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            
            if(target < arr[mid]){
                end=mid-1;
            }
            else if(target> arr[mid]){
                start=mid +1;
            }
            else{
                return arr[mid];
            }
        }
             return arr[end];   
    }
}



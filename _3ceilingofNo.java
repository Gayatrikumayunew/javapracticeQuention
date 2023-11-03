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
// a number which is greater than yout target but smaller than other
//code only for ascending
public class _3ceilingofNo {
    public static void main(String [] args){
        int []arr={2,22,23,45,56,78};
        int target=79;
        int ans= findceiling(arr,target);
        System.out.print(ans);
    
    }
    static int findceiling(int []arr, int target){
        if(target>arr[arr.length-1]){
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
             return arr[start];   
    }
}

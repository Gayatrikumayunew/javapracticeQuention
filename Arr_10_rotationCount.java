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
public class Arr_10_rotationCount {
    
public static void main(String [] ar){
    int []arr={7,8,9,5,6};
    int ans=countrotation(arr);
System.out.println(ans);

}
private static int countrotation(int []arr){
int pivot=findpivot(arr);
if(pivot==-1){
    return 0;
}
return pivot+1;
}
static int findpivot(int arr[]){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
    int mid=        start+(end-start)/2;
    if(arr[mid]>arr[mid+1]){
        return mid;
    }
    if(arr[mid]<arr[mid-1]){
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
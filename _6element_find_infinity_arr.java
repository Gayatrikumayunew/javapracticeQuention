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
//public class _6element_find_infinity_arr {
// public static void main(String [] ar){
//     int arr[]={1,2,5,16,144,485,785};
//     int target=144;
//     int ans= and(arr[],target);
// }
//   static int and(int arr[],int target){
//     int start=0;
//     int end=1;
//     while(target>arr[end]){
//         int newstart=end+1;
//         end=end*2;
//         start=newstart;
//     }
//     return binarysearch(arr[],target,start,end);
// }
// static int binarysearch(int[] arr,int target,int start,int end){
//     while(start<=end){
//         int mid=start+(end-start)/2;
//         if(target>mid){
//             start=mid+1;
//         }
//         else if(target<mid){
//             end=mid-1;
//         }
//         else{
//             return mid;
//         }
//     }   
//     return -1;
// }
//}
public class _6element_find_infinity_arr {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 16, 144, 485, 785};
        int target = 144;
        int ans = findInfiniteArray(arr, target);
        System.out.println(ans);
    }

    static int findInfiniteArray(int arr[], int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

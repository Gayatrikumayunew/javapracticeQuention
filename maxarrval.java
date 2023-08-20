/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnvern2;

/**
 *
 * @author gayatri
 */
public class maxarrval {
    public static void main(String[] rd){
        int arr[]={7,9,15,12,24};
        System.out.println(max(arr));
        System.out.print(maxrange(arr,1,3));
    }
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
            max=arr[i];
        }
        
    }
        return max;
}
    // now finding maxval in given range
    public static int maxrange(int[] arr ,int index1,int index2){
        int maxr=arr[index1];
       for (int i = index1; i <= index2; i++) {  
    if (arr[i] > maxr) {
        maxr = arr[i];
    }
}return maxr;


} }
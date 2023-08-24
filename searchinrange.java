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
//returning array index by searching within range
public class searchinrange {
    public static void main(String[] ar){
        int arr[]={4,5,7,6,3,8,9,10};
        int target=3;
        int start=2;
        int end=6;
        int ansindex=search(arr,start, end, target);
        System.out.print(ansindex);
    }
    public static int search(int []arr,int start,int end,int target){
        for(int i=start;i<end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}

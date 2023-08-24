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
public class sumOfmaxina2drray {
    public static void main(String[] ar){
        int arr[][]={
            {1,4,3},{8,2,4},{9,21,3}
        };
       int a= findWealth(arr);
       
        
        System.out.print(a);
    }
    public static int findWealth(int [][]arr)
         {
                int ans=Integer.MIN_VALUE;
    
        for(int row=0;row<arr.length;row++)
        {
            int sum=0;
            for(int col=0;col<arr[row].length;col++)
            {
               sum= sum +  arr[row][col];
            }
            if(sum>ans)
            {
                ans=sum;
            }
            
        }
        return ans;
        
    }
}

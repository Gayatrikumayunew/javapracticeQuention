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
public class _5last_first_position_element {
    public static void main(String [] ar){
        
        int[] nums={5,7,7,7,8,8,10};
        int target =7;
        int[] ans=searchRange(nums,target);
                for (int num : ans) {
            System.out.print(num + " ");
        }

    }
   static public int[] searchRange(int [] nums,int target){
        int ans[]={-1,-1};
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
  static int search(int[] nums,int target,boolean findstart){
       int ans=-1;
       int start=0;
       int end=nums.length-1;
       while(start<=end){
           int mid=start+(end-start)/2;
           if(target<nums[mid]){
               end=mid-1;
           }
           else if(target>nums[mid]){
               start=mid+1;
           }
           else{
               ans =mid;
               if(findstart){
                   end=mid-1;
               }
               else{
                   start=mid+1;
               }
           }
       }
       return ans;
   }
}

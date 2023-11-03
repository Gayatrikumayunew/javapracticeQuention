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
public class _01maxwealth {
    public static void main(String [] args){
        int [][]accounts={{1,2,3},{4,5,61}};
        int ans1=maximumWealth(accounts);
        System.out.println(ans1);
        
    }
  static  public int maximumWealth(int [][]accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0; person< accounts.length; person++)
        
                {
                    int sum=0;
            for(int account=0;account < accounts[person].length; account++){
                sum +=accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}

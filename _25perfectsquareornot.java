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
public class _25perfectsquareornot {
    public static void main(String[]ar){
    int n=25;
  for(int i=1;i<n/2;i++){
      if(i*i==n){
          System.out.print("given number is square root of"+i);
          return;
      }
     }    
    }
}

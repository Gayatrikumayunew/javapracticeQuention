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
public class _19countevenoddarr {
    static void evenodd(int arr[]){
        int even=0;
        int odd=0;
    
    for(int i=0; i<arr.length;i++ ){
    if(arr[i] %2==0){
        even++;
    }
    else{
        odd++;
    }
}
         System.out.println("even" +even);
   System.out.println("odd" +odd);
   
}
    public static void main(String []ar){
        int arr[]={22,32,42,52,1};
        evenodd(arr);
        
    }
}
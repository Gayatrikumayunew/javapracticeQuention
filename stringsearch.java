/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

import java.util.Arrays;

/**
 *
 * @author gayatri
 */
public class stringsearch {
    public static void main(String[] ar){
        String str="gayatri";
        char target='g';
        System.out.println(search(str,target));
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
       // System.out.println(Arrays.toString(str.toCharArray()));
//        for(int i=0;i<str.length();i++){
//            if(target==str.charAt(i)){
//                    return true;
//        }
//            
//    }
//can also solve by forEach loop
   for(char ch:str.toCharArray())//coverting string array to char array
{
    if(ch==target){
        return true;
    }
}
        return false;
    }}


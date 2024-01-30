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
public class _41PrintingAlphabetUsingStringBuilder {
    public static void main(String []ar){
        
    //String are immutable always crate a new object so too much memory waste so we use stringbuilder
//    String s="";
//    for(int i=0;i <26;i++){
//        char c=(char)('a'+i);
//        s=s+c;
//    
//}
//    System.out.println(s);
StringBuilder build=new StringBuilder();
 for(int i=0;i <26;i++){
      char c=(char)('a'+i);
        build.append(c);
//   
}
 System.out.println(build);
 System.out.println(build.reverse());
}}

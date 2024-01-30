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
//in java we cant change the string here we are not changing here we are making a new obj,old obj collect by garbage Collection,
//for security reason string are immutable 
public class _40String {
    public static void main(String []ar){
        
//    
//    String name="kunal";
//    System.out.println(name);
//    name="kushwah";
//        System.out.println(name);
//----------------checking 
//System.out.println((56));// internally calling toString ans will be a string.
//String a="gayu";
//String b="gayu";
//System.out.println(a==b);//here both a and b are pointing to same value
////-----------so how we can create diff obj
//String a1= new String("gayu");
//String b1=new String ("gayu");
//System.out.println(a1==b1);
//System.out.println(a1.equals(b1));//.equals method check the values only not references
//System.out.println(a1.charAt(0));
//String h=null;
//System.out.println(h);

//Integer num=new Integer(50);
//System.out.println(num);// auatomatically calling tostring method
//System.out.println(num.toString());
//-----------------------------------------preeti printing--------------------
//float b=451.1257f;
//System.out.printf(" value %.2f",b);
//System.out.printf("hi %.3f",Math.PI);
//System.out.printf("hello this is %s ","gayu");
//----------------------------operators
System.out.print('a'+'b');// converting to unicode then add
System.out.print("a"+"b");

System.out.print((char)('a'+3));
System.out.println("A"+1);
    }
}

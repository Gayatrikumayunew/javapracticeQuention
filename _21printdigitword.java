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
public class _21printdigitword {
    static void printvalue(char digit){
            switch (digit){
                 case '0':
                     System.out.print("Zero ");
                     break;
                 case '1':
                     System.out.print("one");
                    break;
                 case '2':
                     System.out.print("two");
                     break;
                 case '3':
                     System.out.print("three");
                     break;
                 case '4':
                     System.out.print("four");
                     break;
                 case '5':
                     System.out.print("five");
                     break;
                 case '6':
                     System.out.print("six");
                     break;
                 case '7':
                     System.out.print("seven");
                     break;
                 case '8':
                     System.out.print("eight");
                     break;
                 case '9':
                     System.out.print("nine");
                     break;
            }
            

    }
//    static void printword(String n){
//        for(int i=0;i<n.length();i++){
//            System.out.println(n.charAt(i));
//        }
//    }
    static void printword(String n) {
    for (int i = 0; i < n.length(); i++) {
        char digit = n.charAt(i);
        printvalue(digit);
    }
}

    public static void main(String[]args){
        String n= "120";
        printword(n);
    }
}

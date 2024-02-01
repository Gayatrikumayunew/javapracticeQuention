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
public class _43PatternPrinting {
    public static void main(String[] ar){
       // pattern1(5);
     //  pattern2(5);
   //  pattern3(5);
//  pattern4(5);
pattern5(5);
        
    }
//    static void pattern1(int n){
//        for(int row=1;row<=n;row++){
//            // for every row,run the column
//            for(int col=1;col<=row;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
    //------------------------------
//    static void pattern2(int n){
//      for(int row=1;row<=n;row++){
//            // for every row,run the column
//            for(int col=1;col<=n;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//   //----------------------
//    static void pattern3(int n){
//      for(int row=1;row<=n;row++){
//            // for every row,run the column
//            for(int col=0;col<=n-row;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
   //--------------------pattern4
//    static void pattern4(int n){
//        for(int i=1;i<=n;i++){
//            for(int col=1;col<=i;col++){
//                System.out.print(col);
//            }
//            
//            System.out.println();
//        }
//    }
//    
    //------------------------pattern5
    static void pattern5(int n){
        for(int row=0;row<2*n;row++){
            int totalcol=row>n?2*n-row:row;
            for(int col=0;col<totalcol;col++){
                System.out.print("* ");
            }
            System.out.println();
            
            
            
        }
    }
}

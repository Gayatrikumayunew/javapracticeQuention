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
public class _44PatternPrinting2 {
    public static void main(String []args){
      //  pattern6(5);
   //   pattern7(5);
//   pattern8(5);
pattern9(4);
pattern10(4);
pattern11(4);
   }
//    static void pattern6(int n){
//        for(int row=0;row<2*n;row++){
//            int totalcol=row>n?2*n-row:row;
//            
//            int nospaces=n-totalcol;
//            for(int s=0;s<nospaces;s++){
//                System.out.print(" ");
//            }
//            for(int col=0;col<totalcol;col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    static void pattern7(int n){
//        for(int row=1;row<=n;row++){
//            for(int spaces=0;spaces<n-row;spaces++){
//                System.out.print("  ");
//            }
//            for(int col=row;col>=1;col--){
//                System.out.print(col);
//            }
//            for(int col=2;col<=row;col++){
//                System.out.print(col);
//            }
//         System.out.println();   
//        }
//    }
//    static void pattern8(int n){
//        for(int row=1;row<=2*n;row++){
//            int c=row>n?2*n-row:row;
//            
//            for(int space=0;space<n-c;space++){
//                System.out.print("  ");
//            }
//            for(int col=c;col>=1;col--){
//                System.out.print(col);
//            }
//            for(int col=2;col<=c;col++){
//                System.out.print(col);
//                
//                
//            }
//            System.out.println();
//        }
    
    
//}
    static void pattern11(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int index=Math.max(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(index+" ");
                
                }
            System.out.println();
        }
    }//
    
    static void pattern9(int n){
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int index=Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(index+" ");
                
                }
            System.out.println();
        }
    }
     static void pattern10(int n){
         int original=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int index=original- Math.min(Math.min(row, col), Math.min(n-row, n-col));
                System.out.print(index+" ");
                
                }
            System.out.println();
        }
    }

}

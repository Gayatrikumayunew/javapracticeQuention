
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gayatri
 */
public class _47UnionArr {
    public static void main(String [] ar){
        int a[]={1,2,3,4};
        int b[]={4,5,6,7};
        int[] ans = mergeArr(a, b);

        // Print the merged array
        System.out.println("Merged Array: " + Arrays.toString(ans));
        System.out.println(arrayToSet(ans));
        System.out.print(ans.length);
        
            
        }
     public static Set<Integer> arrayToSet(int[] arr) {
 Set <Integer> set=new HashSet<Integer>();
 for(int num:arr){
     set.add(num);
 }
 return set;
                

    }
    static int[] mergeArr(int a[],int b[]){
        int lenght1=a.length;
        int length2=b.length;
        int newarr[]=Arrays.copyOf(a,lenght1+length2 );
        System.arraycopy(b, 0, newarr,lenght1,length2);
        return newarr;
    }
}

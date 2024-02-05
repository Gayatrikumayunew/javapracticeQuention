/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

public class _50findIthBit {
    public static void main(String[] ar) {
        int arr =10;
        int bit = 2;
        System.out.print(ans(arr, bit));
    }

    static int ans(int arr, int n) {
        int r = (arr >> (n - 1)) & 1;
        return r;
    }
}

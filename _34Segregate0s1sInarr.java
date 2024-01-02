package javapractice;

import java.util.Arrays;

public class _34Segregate0s1sInarr {
    public static void main(String[] ar) {
        int arr[] = {0, 0, 1, 0, 1, 0, 1};
        int count0 = 0;
        int count1 = 0;

        for (int count = 0; count < arr.length; count++) {
            if (arr[count] == 0) {
                count0++;
            } else {
                count1++;
            }
        }

        for (int i = 0; i < count0; i++) {
            arr[i] = 0;
        }
        for (int i = count0; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print the segregated array
        System.out.println(Arrays.toString(arr));
    }
}

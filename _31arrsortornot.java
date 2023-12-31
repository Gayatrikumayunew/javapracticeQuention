package javapractice;

public class _31arrsortornot {
    public static void main(String[] args) {
        int arr[] = {4, 5, 1,6, 7, 8, 9};

        // Assuming the array is sorted until proven otherwise
        boolean isSorted = true;

        // Check if the array is sorted in ascending order
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Print the result
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}

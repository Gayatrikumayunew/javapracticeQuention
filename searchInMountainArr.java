
public class searchInMountainArr {
    
public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 8, 7, 6, 2, 1};
        int target = 5;

        Solution solution = new Solution();
        int result = solution.findInMountainArray(target, arr);

        if (result != -1) {
            System.out.println("Target " + target + " found at index " + result);
        } else {
            System.out.println("Target " + target + " not found in the mountain array.");
        }
    }
}

class Solution {
    public int findInMountainArray(int target, int arr[]) {
        int peak = peakindex(arr);
        int first = orderIgnosticBSearch(arr, target, 0, peak);
        if (first != -1) {
            return first;
        }
        return orderIgnosticBSearch(arr, target, peak, arr.length - 1);
    }

    public int peakindex(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int orderIgnosticBSearch(int arr[], int target, int start, int end) {
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}

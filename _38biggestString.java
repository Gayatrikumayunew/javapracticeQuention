
public class _38biggestString {
    public static void main(String[] ar) {
        String arr[] = {"gfg", "gayu", "mit", "yash", "google"};
        int maxLength = arr[0].length();
        int maxLengthIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > maxLength) {
                maxLength = arr[i].length();
                maxLengthIndex = i;
            }
        }

        System.out.println(arr[maxLengthIndex]);
    }
}
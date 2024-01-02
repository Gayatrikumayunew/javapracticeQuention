
package javapractice;



public class _33wordPresentInSentense {
    public static void main(String[] args) {
        String wrd = "gayu";
        String sen = "gayu is beautiful one";
        String[] words = sen.split(" ");

        for (String temp : words) {
            // Your logic goes here using the 'temp' variable
            // For example, check if 'temp' is equal to 'wrd'
            if (temp.equals(wrd)) {
                System.out.println("Word '" + wrd + "' is present in the sentence.");
            }
        }
    }
}


import java.util.Scanner;



public class _29armstrongNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int digitCount = countDigits(number);
        boolean isArmstrong = isArmstrongNumber(number, digitCount);

        if (isArmstrong) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to count digits in a number
    public static int countDigits(int num) {
        int count = 0;
        num = Math.abs(num);

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int num, int digitCount) {
        int originalNumber = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digitCount);
            num /= 10;
        }

        return sum == originalNumber;
    }
}

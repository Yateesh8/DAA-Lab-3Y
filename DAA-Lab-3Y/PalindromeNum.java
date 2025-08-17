import java.util.Scanner;

public class PalindromeNum {

    // Method to check and print Palindrome
    public static void isPalindrome(int num) {
        int temp = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (rev == temp) {
            System.out.println(temp + " is a Palindrome number.");
        } else {
            System.out.println(temp + " is not a Palindrome number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        isPalindrome(num);
    }
}

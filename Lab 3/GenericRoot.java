package Lab3;

import java.util.Scanner;

public class GenericRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        while (n >= 10) {
            int sum = 0;
            int temp = n;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            n = sum;
        }

        System.out.println("Generic root of the number is: " + n);
        sc.close();
    }
}

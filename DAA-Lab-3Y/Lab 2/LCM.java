package Lab2;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int gcd = a, num = b;
        while (num != 0) {
            int temp = num;
            num = gcd % num;
            gcd = temp;
        }

        int lcm = (a * b) / gcd;
        System.out.println("L.C.M is: " + lcm);
        sc.close();
    }
}

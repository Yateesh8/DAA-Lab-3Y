package Lab3;

import java.util.Scanner;

public class AddSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original string: ");
        String original = sc.nextLine();
        System.out.print("Enter substring to add: ");
        String sub = sc.nextLine();
        System.out.print("Enter position (index) to insert: ");
        int pos = sc.nextInt();

        if (pos < 0 || pos > original.length()) pos = original.length();
        String result = original.substring(0, pos) + sub + original.substring(pos);
        System.out.println("Resulting string: " + result);

        sc.close();
    }
}

package Lab3;

import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int vowels = 0, digits = 0, chars = 0, words = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ("AEIOUaeiou".indexOf(c) != -1) vowels++;
            else if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) chars++;
        }

        words = str.trim().isEmpty() ? 0 : str.trim().split("\\s+").length;

        System.out.println("Vowels: " + vowels);
        System.out.println("Digits: " + digits);
        System.out.println("Characters: " + chars);
        System.out.println("Words: " + words);

        sc.close();
    }
}

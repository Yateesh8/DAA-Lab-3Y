package Lab2;

public class CountBits {
    public static void main(String[] args) {
        int n = 29; // Example number
        int count = 0;
        int num = n;
        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }
        System.out.println("Number of bits set to 1 in " + n + " is: " + count);
    }
}

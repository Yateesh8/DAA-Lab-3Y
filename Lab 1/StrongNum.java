import java.util.Scanner;

public class StrongNum {
    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;

    }
    public static boolean strongNumber(int num) {
        int temp = num;
        int sum = 0;
        while (num>0) {
            int digit = num % 10;
            sum += fact(digit);
            num = num / 10;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(strongNumber(num));
    }
}

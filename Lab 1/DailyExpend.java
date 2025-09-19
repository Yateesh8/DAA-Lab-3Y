import java.util.Scanner;

public class DailyExpend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your monthly expenditure: ");
        int monthly = sc.nextInt();

        int days = 30;
        int daily = 0;

        for (int i = 1; i <= days; i++) {
            daily = monthly / days;
        }

        System.out.println("Your daily expenditure = " + daily);
    }
}

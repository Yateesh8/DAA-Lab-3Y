package Lab2;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 99, 50};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number in the array is: " + max);
    }
}

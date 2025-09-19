package Lab2;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 99, 50};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Second largest number in the array is: " + secondLargest);
    }
}

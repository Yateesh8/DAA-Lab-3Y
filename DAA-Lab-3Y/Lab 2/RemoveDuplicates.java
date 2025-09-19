package Lab2;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        int[] temp = new int[arr.length];
        int j = 0;

        Arrays.sort(arr); // optional
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length - 1];

        int[] result = Arrays.copyOf(temp, j);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}

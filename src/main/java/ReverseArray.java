import java.util.stream.IntStream;

/**
 * Problem: Given array A consisting of N integers, return the reversed array
 * Solution: We can iterate over the first half of the array and exchange the elements with
 * those in the second part of the array
 */
public class ReverseArray {

    public static int[] reverse(int[] arr) {
        int j = 1; // step down counter
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            int temp = arr[len - j];
            arr[len - j++] = arr[i]; // assign to the high end of the index and then step down by 1
            arr[i] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        IntStream.of(arr).forEach(System.out::print);
        System.out.println();
        int[] reversed = reverse(arr);
        IntStream.of(arr).forEach(System.out::print);
    }
}

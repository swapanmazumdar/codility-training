import java.util.stream.IntStream;

public class CyclicRotation_Solution {

    public static int[] cyclicShift(int[] arr, int k) {
        int arrayLength = arr.length;
        if (arrayLength == 1)
            return arr;
        int[] shifted = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            int shift_pos = i + k;
            if (shift_pos > arrayLength - 1) {
                shift_pos = Math.abs(arrayLength - shift_pos);
            }
            if (shift_pos >= arrayLength) {
                shift_pos %= arrayLength;
            }
            shifted[shift_pos] = arr[i];
        }
        return shifted;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 1, 2, 3, 5};
        arr = new int[]{-1, -2, -3, -4, -5, -6};
        //IntStream.of(cyclicShift(arr, 42)).forEach(System.out::print);
        IntStream.of(cyclicShift(arr, 10)).forEach(System.out::print);
        System.out.println();
    }
}

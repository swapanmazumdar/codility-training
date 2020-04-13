import java.util.OptionalInt;
import java.util.stream.IntStream;

public class CountingElements_Solution {

    private int[] stdDeviation;

    /**
     * Store the data in a slightly different way, by making an array of counters. Each number may be counted in the
     * array by using an index that corresponds to the value of the given number.
     */
    private void initialize(int[] arr) {
        OptionalInt max = IntStream.of(arr).sorted().max();
        stdDeviation = new int[max.getAsInt() + 1];
        for (int i = 0; i < arr.length; i++) {
            ++stdDeviation[arr[i]];
        }
        IntStream.of(arr).forEach(System.out::print);
        System.out.println();
        IntStream.of(stdDeviation).forEach(System.out::print);
        System.out.println();
    }

    public int getCount(int num) {
        return stdDeviation[num];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 4, 2, 4, 5};
        CountingElements_Solution countingElements_solution = new CountingElements_Solution();
        countingElements_solution.initialize(arr);
        System.out.println(countingElements_solution.getCount(4));
        System.out.println(countingElements_solution.getCount(0));
    }
}

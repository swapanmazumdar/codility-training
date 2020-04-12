public class OddOccurrencesInArray_Solution {
    private int[] stddeviation;

    public int solution(int[] A) {
        // write your code in Java SE 8
        initializeStdDeviation(A);
        return findOddOccurence(stddeviation);
    }

    private int findOddOccurence(int[] stddeviation) {
        for (int i = 0; i < stddeviation.length; i++) {
            if(stddeviation[i] % 2 != 0) {
                return i;
            }
        }

        return -1;
    }

    private void initializeStdDeviation(int[] arr) {
        java.util.OptionalInt largestNum = java.util.stream.IntStream.of(arr).max();
        stddeviation = new int[largestNum.getAsInt() + 1];

        for (int i = 0; i < arr.length; i++) {
            stddeviation[arr[i]] = ++stddeviation[arr[i]];
        }
        java.util.stream.IntStream.of(stddeviation).forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {9, 3, 9, 3, 9, 7, 9};
        OddOccurrencesInArray_Solution oddOccurrencesInArray_solution = new OddOccurrencesInArray_Solution();
        System.out.println(oddOccurrencesInArray_solution.solution(arr));
    }
}

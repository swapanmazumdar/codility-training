public class TimeComplexity_Solution {

    public int slowSolution(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                result += 1;
            }
        }
        return result;
    }

    public int fastSolution(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
                result += i;
        }
        return result;
    }

    public int modelSolution(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        TimeComplexity_Solution timeComplexity_solution = new TimeComplexity_Solution();
        System.out.println(timeComplexity_solution.slowSolution(4));

        System.out.println(timeComplexity_solution.fastSolution(4));

        System.out.println(timeComplexity_solution.modelSolution(4));
    }
}

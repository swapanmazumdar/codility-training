import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter1_Iterations {

    private static void forLoop(List<String> list) {

        for (String listItem : list) {
            System.out.print(listItem + " ");
        }
        System.out.println();
    }

    private static int factorial(int n) {
        System.out.println(n);
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    private static void printTriangleWith(int n, char symbol) {
        for (int i = 0; i < n; i++) { // the outer loop should print one row in each step
            for (int j = 0; j <= i; j++) { // the inner loop should print one symbol in each step
                System.out.print(symbol);
            }
            System.out.println();
        }
    }

    private static void printSymmetricalTriangle(int n, char symbol) {
        for (int i = n; i > 0; i--) {
            for (int k = 0; k < (2 * i - 1); k++) {
                for (int j = 0; j < n - i; j++) {
                }
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }

    private static int countNumberOfDigitsIn(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    private static void fibonaciSequence(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while(a <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> weekdays = Stream.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday").collect(Collectors.toList());

        forLoop(weekdays);

        System.out.println(factorial(5));

        printTriangleWith(5, '*');

        printSymmetricalTriangle(4, '*');

        System.out.println(countNumberOfDigitsIn(101));

        fibonaciSequence(5);
    }
}

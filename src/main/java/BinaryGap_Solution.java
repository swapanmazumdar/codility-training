import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BinaryGap_Solution {

    private static Pattern pattern = Pattern.compile("0+");

    private static int computeBinaryGap(int n) {
        String binaryString = Integer.toBinaryString(n);
        System.out.println(binaryString);
        Matcher matcher = pattern.matcher(binaryString);
        int count = 0;
        int binaryGap = 0;
        while (matcher.find()) {
            count++;
            String group = matcher.group();
            int tempGap = matcher.end() - matcher.start();
            if (binaryString.length() != matcher.end()) {
                binaryGap = Math.max(tempGap, binaryGap);
            }
        }
        if (count == 1 && binaryString.charAt(binaryString.length() - 1) == '0')
            binaryGap = 0;
        return binaryGap;
    }

    public static void main(String[] args) {
        System.out.println(computeBinaryGap(1));
        System.out.println(computeBinaryGap(2));
        System.out.println(computeBinaryGap(3));
        System.out.println(computeBinaryGap(4));
        System.out.println(computeBinaryGap(5));
        System.out.println(computeBinaryGap(6));
        System.out.println(computeBinaryGap(7));
        System.out.println(computeBinaryGap(8));
        System.out.println(computeBinaryGap(20));
        System.out.println(computeBinaryGap(32));
        System.out.println(computeBinaryGap(1041));
        System.out.println(computeBinaryGap(328));
        System.out.println(computeBinaryGap(1024));
        System.out.println(computeBinaryGap(51712));
        System.out.println(computeBinaryGap(1610612737));
    }

}

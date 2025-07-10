import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        char[] chars = s.toCharArray();

        Map<Character, Integer> values = new HashMap<>();
        values.put('I',1); values.put('V',5); values.put('X',10); values.put('L', 50); values.put('C', 100); values.put('D', 500); values.put('M', 1000);

        int sum=values.get(chars[chars.length-1]);

        System.out.println("Initial Sum:"+sum);

        for(int i=chars.length-1;i>0;i--) {

            if (values.get(chars[i]) <= values.get(chars[i - 1])) {
                sum += values.get(chars[i - 1]);
            } else {
                sum -= values.get(chars[i - 1]);
            }
        }

        System.out.println("Total sum: "+sum);

    }
}

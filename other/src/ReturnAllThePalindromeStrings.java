import java.util.Arrays;
import java.util.List;

public class ReturnAllThePalindromeStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("One", "Eveve", "Nine", "Royor", "SeeyaPatiRam");
        List<String> palindrome = strings.stream()
                .filter(str->str.equalsIgnoreCase(new StringBuilder(str).reverse().toString()))
                .toList();

        System.out.println("String with Palindrome are:"+palindrome);
    }
}

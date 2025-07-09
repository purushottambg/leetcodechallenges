import java.util.Arrays;

public class LongestPrefix {
    public static void main(String[] args) {
        String[] str = {"Radha", "Raja", "Rajiv", "Rajaram"};
        String longestPrefix = longestCommonPrefix(str);
        System.out.println("Longest Prefix is: "+longestPrefix);
    }

    static String longestCommonPrefix(String[] strs) {
        int range=0;

        Arrays.sort(strs);

        String firstElement = strs[0];
        String lastElement = strs[strs.length-1];
        int minLength = Math.min(firstElement.length(), lastElement.length());

        while (range<minLength && firstElement.charAt(range)==lastElement.charAt(range)){
            range++;
        }

        if(range>0)
            return firstElement.substring(0,range);
        return "";
    }
}

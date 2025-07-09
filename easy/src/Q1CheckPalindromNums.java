public class Q1CheckPalindromNums {
    public static void main(String[] args) {
        int num=10;
        int original=num;
        int reverse=0;
        while(num>9){
            reverse=reverse*10;
            reverse=reverse+num%10;
            num=num/10;
        }
        if (num>0 && num<=9){
            reverse=reverse*10;
            reverse+=num;
        }
        if (reverse==original)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

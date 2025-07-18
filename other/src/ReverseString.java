public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    static int reverse(int s){
        boolean isNegative=false;

        StringBuilder num= new StringBuilder();
        while (s>9){
            num.append(s%10);
            s/=10;
        }
        num.append(s);

        Integer intValue = Integer.parseInt(String.valueOf(num));

        if (isNegative){
            return intValue-intValue-intValue;
        }
        return intValue;
    }
}

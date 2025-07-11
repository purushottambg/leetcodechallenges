public class EqualsMethod {
    public static void main(String[] args) {
        Integer a=128;
        Integer b=128;
        if (a==b)
            System.out.println(a+"=="+b+" is: True");
        if (a.equals(b))
            System.out.println(a+".equals("+b+") is: True");
        else
            System.out.println("False");
    }
}

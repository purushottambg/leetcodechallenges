public class EqualsMethod {
    public static void main(String[] args) {
        Integer a=28;
        Integer b=28;
        if (a==b)
            System.out.println(a+"=="+b+" is: True");
        else if (a.equals(b))
            System.out.println(a+".equals("+b+") is: True");
        else
            System.out.println("False");
    }
}

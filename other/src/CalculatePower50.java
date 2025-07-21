public class CalculatePower50 {
    public static void main(String[] args) {
        double d=Double.valueOf(7);
        System.out.println("3rd power of 7:"+pow(d, 3));
    }
    public static double pow(double x, int n){
        double result=Double.valueOf(1);
        for (int i=1; i<=n;i++){
            result=result*x;
        }
        return result;
    }
}

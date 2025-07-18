import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Add1ToTheIntArray {
    public static void main(String[] args) {
        int[] digit = {7,4,1,0};
        int[] finalArr = plusOne(digit);
        for (int i:finalArr){
            System.out.print(i+" ");
        }
    }

    public static int[] plusOne(int[] arr){

        List<Integer> arrList= new ArrayList<>();
        int fullNumber=0;

        for (int i: arr){
            fullNumber=(fullNumber*10)+i;
        }
        fullNumber+=1;
        while (fullNumber>9){
            arrList.add(fullNumber%10);
            fullNumber/=10;
        }
        if (fullNumber!=0){
            arrList.add(fullNumber);
        }

        Collections.reverse(arrList);
        int[] tempArray = new int[arrList.size()];
        int index=0;
        for (Integer I: arrList){
            tempArray[index] = I;
            index++;
        }
        return tempArray;
    }

    /**
     * public int[] plusOne(int[] digits) {
     *
     *     for (int i = digits.length - 1; i >= 0; i--) {
     *       if (digits[i] < 9) {
     *         ++digits[i];
     *         return digits;
     *       }
     *       digits[i] = 0;
     *     }
     *
     *     int[] ans = new int[digits.length + 1];
     *     ans[0] = 1;
     *     return ans;
     *   }
     */

}

import java.awt.desktop.PreferencesEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListReverseAddition2 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(9,9,9,9,9,9,9);
        List<Integer> list2 = Arrays.asList(9,9,9,9);

        int toBeReversed = reversedListNumber(list1)+reversedListNumber(list2);
        System.out.println("To be reversed is:"+toBeReversed);
        List<Integer> finalList = reverseNumbers(toBeReversed);

        for (int i: finalList){
            System.out.print(i+" ");
        }
    }

    public static List<Integer> reverseNumbers(int number){
        List<Integer> returningList = new ArrayList<>();
        while (number>9){
            returningList.add(number%10);
            number/=10;
        }
        if(number>=0 && number<=9)
            returningList.add(number);

        return returningList;
    }

    public static int reversedListNumber(List<Integer> list){
        int number=0;

        for (int i: list){
            number*=10;
            number+=i;
        }

        return number;
    }
}

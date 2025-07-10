import java.util.*;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 5, 7, 8, 9, 12, 54, 87, 97);
        List<Integer> list2 = Arrays.asList(4, 6, 7, 11, 19, 21, 34, 57, 75, 88, 97);
        List<Integer> finalList = new ArrayList<>();

        finalList.addAll(list1);
        finalList.addAll(list2);
        Collections.sort(finalList);

        for (Integer element: finalList){
            System.out.print(element+"-> ");
        }

    }
}

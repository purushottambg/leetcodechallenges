import java.util.Arrays;

public class RemoveDuplicateFromSortedArray26 {
    public static void main(String[] args) {
        int[] arr = {1,34,6,76,87,990,6,45,34,42,54,67,78};
        int round=1;
        Arrays.sort(arr);
        for (int i:arr){
            System.out.print(i+"-> ");
        }
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                round++;
                for (int j = i+1; j <arr.length-round ; j++) {
                    arr[j+1]=arr[j+2];
                }
            }
        }
        System.out.println("\nAfter filtering");
        for (int i:arr){
            System.out.print(i+"-> ");
        }
    }
}

import java.util.Arrays;

public class RemoveElementsByVal27 {
    public static void main(String[] args) {
        int []arr = {3,2,2,3};
        int val =3;
        System.out.println("\nafter removing val: "+removeElement(arr, val));
    }

    public static int removeElement(int[] nums, int val) {
        int index=0;
        int[] dup = new int[nums.length];
        for (int num: nums){
            if(num!=val){
                dup[index]=num;
                index++;
            }
        }
        nums= Arrays.copyOf(dup, dup.length);
        for (int i: nums){
            System.out.print(i+" ");
        }
        return nums.length-index;
    }
}

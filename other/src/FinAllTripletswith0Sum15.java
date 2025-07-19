import java.util.*;
import java.util.stream.Collectors;

public class FinAllTripletswith0Sum15 {
    public static void main(String[] args) {

        int[] array = {-1,0,1,2,-1,-4};

        List<List<Integer>> allTriplets = threeSum(array);
        System.out.println("All the triplets");
        for (List<Integer> list : allTriplets){
            for (int i: list){
                System.out.print(i+" ");
            }
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
            return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i + 2 < nums.length; ++i) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            // Choose nums[i] as the first number in the triplet, then search the
            // remaining numbers in [i + 1, n - 1].
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                final int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    while (l < r && nums[l] == nums[l - 1])
                        ++l;
                    while (l < r && nums[r] == nums[r + 1])
                        --r;
                } else if (sum < 0) {
                    ++l;
                } else {
                    --r;
                }
            }
        }

        return ans;
    }
}

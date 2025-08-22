public class FindElementIndexInSortedRotatedArray {
    public static void main(String[] args) {
        System.out.println("Target Index is:"+search(new int[]{4,5,6,7,0,1,2},0 ));
    }
    public static int search(int[] nums, int target) {
        int firstLeftIndex = 0, firstRightIndex=0,secLeftIndex=0,secRightIndex=nums.length-1, firstRightElement=0,secRightElement=nums[nums.length-1];
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]) {
                firstRightIndex=i;
                firstRightElement=nums[i];
            }
        }

        if(target<secRightElement){
            for (int i=firstLeftIndex+1; i<nums.length;i++){
                if(nums[i]==target) return i;
            }
        }

        if(target>secRightElement && target<firstRightElement){
            for (int i=0; i<firstRightIndex;i++){
                if(nums[i]==target) return i;
            }
        }

        return -1;
    }
}

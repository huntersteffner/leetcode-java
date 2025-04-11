public class SearchInsert {
    public static void main(String[] args) {
        int[] exampleOne = {1,3,5,6};

        System.out.println(searchInsert(exampleOne, 0));
        System.out.println(searchInsert(exampleOne, 5));
        System.out.println(searchInsert(exampleOne, 2));
        System.out.println(searchInsert(exampleOne, 7));
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int midPoint = 0;

        while(low <= high) {
            midPoint = (low + high) / 2;
            int midNumber = nums[midPoint];

            if (midNumber == target) {
                return midPoint;
            } else if (midNumber < target) {
                low = midPoint + 1;
            } else {
                high = midPoint - 1;
            }
        }
        return low;
    }
}

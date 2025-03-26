import java.util.Arrays;

public class TwoSum {
    
    public static void main(String[] args) {



        int[] exampleOne = {2,7,11,15};
        int[] exampleTwo = {3,2,4};
        int [] exampleThree = {3,3};

        System.out.println("Hello there");
        System.out.println(Arrays.toString(twoSum(exampleOne, 9)));
        System.out.println(Arrays.toString(twoSum(exampleTwo, 6)));
        System.out.println(Arrays.toString(twoSum(exampleThree, 6)));
        

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] indexedNumbers = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    indexedNumbers[0] = i;
                    indexedNumbers[1] = j;
                    return indexedNumbers;
                }
            }
        }
        return indexedNumbers;
    }
}

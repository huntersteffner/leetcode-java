import java.util.Arrays;

public class ArrayToBST {

    public static void main(String[] args) {
        int[] exampleOne = {-10,-3,0,5,9};
        int[] exampleTwo = {1,3};

        TreeNode answerOne = sortedArrayToBST(exampleOne);
        TreeNode answerTwo = sortedArrayToBST(exampleTwo);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }

        if (nums.length == 2) {
            return new TreeNode(
                nums[0],
                null,
                new TreeNode(nums[1])
            );
        }

        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid + 1, nums.length);

        TreeNode node = new TreeNode(
            nums[mid],
            sortedArrayToBST(left),
            sortedArrayToBST(right)
        );

        return node;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

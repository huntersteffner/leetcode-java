public class MaxDepth {

    public static void main(String[] args) {
        TreeNode exampleOne = new TreeNode(
            3,
            new TreeNode(
                9
            ),
            new TreeNode(
                20,
                new TreeNode(
                    15
                ),
                new TreeNode(
                    7
                )
            )
        );

        TreeNode exampleTwo = new TreeNode(
            1,
            null,
            new TreeNode(
                2
            )
        );

        TreeNode exampleThree = new TreeNode(
            1,
            new TreeNode(
                2
                ),
            null
        );


        System.out.println(maxDepth(exampleThree));
        System.out.println(maxDepth(exampleOne));
        System.out.println(maxDepth(exampleTwo));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int max = Math.max(maxDepth(root.left), maxDepth(root.right));

        return max + 1;
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

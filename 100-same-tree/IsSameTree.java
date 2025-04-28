public class IsSameTree {

    public static void main(String[] args) {

        TreeNode exampleOneTreeOne = new TreeNode(
            1,
            new TreeNode(2),
            new TreeNode(3)
        );

        TreeNode exampleOneTreeTwo = new TreeNode(
            1,
            new TreeNode(2),
            new TreeNode(3)
        );

        TreeNode exampleTwoTreeOne = new TreeNode(
            1,
            new TreeNode(2),
            null
        );

        TreeNode exampleTwoTreeTwo = new TreeNode(
            1,
            null,
            new TreeNode()
        );

        TreeNode exampleThreeTreeOne = new TreeNode(
            1,
            new TreeNode(2),
            new TreeNode(1)
        );

        TreeNode exampleThreeTreeTwo = new TreeNode(
            1,
            new TreeNode(1),
            new TreeNode(2)
        );

        System.out.println(isSameTree(exampleOneTreeOne, exampleOneTreeTwo));
        System.out.println(isSameTree(exampleTwoTreeOne, exampleTwoTreeTwo));
        System.out.println(isSameTree(exampleThreeTreeOne, exampleThreeTreeTwo));
        
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) {
            return true;
        }

        boolean isCurrentSame;
        if (p != null && q != null && p.val == q.val) {
            isCurrentSame = p.val == q.val;
        } else {
            return false;
        }
        boolean isLeftSame = true;
        boolean isRightSame = true;

        if (p.left != null || q.left != null) {
            isLeftSame = isSameTree(p.left, q.left);
        }

        if (!isLeftSame) {
            return false;
        }

        if (p.right != null || q.right != null) {
            isRightSame = isSameTree(p.right, q.right);
        }



        return isCurrentSame && isLeftSame && isRightSame;
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

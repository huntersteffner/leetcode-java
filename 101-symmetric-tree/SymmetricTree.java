public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode exampleOne = new TreeNode(
            1, // Head
            new TreeNode( // left child
                2,
                new TreeNode(
                    3
                ),
                new TreeNode(
                    4
                )
            ),
            new TreeNode( // right child
                2,
                new TreeNode(
                    4
                ),
                new TreeNode(
                    3
                )
            )
        );

        TreeNode exampleTwo = new TreeNode(
            1,
            new TreeNode(
                2,
                null,
                new TreeNode(3)
            ),
            new TreeNode(
                2,
                null,
                new TreeNode(3)
            )
        );

        TreeNode exampleThree = new TreeNode(
            1,
            new TreeNode(
                2,
                null,
                new TreeNode(3)
            ),
            new TreeNode(
                2,
                new TreeNode(3),
                null
            )
        );

        System.out.println(isSymmetric(exampleThree));
        System.out.println(isSymmetric(exampleOne));
        System.out.println(isSymmetric(exampleTwo));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) {
            return true;
        } else if (root.left != null && root.right == null) {
            return false;
        } else if (root.left == null && root.right != null) {
            return false;
        }
        if (root.left.val != root.right.val) {
            return false;
        }

        if (!areChildrenSymmetric(root.left, root.right)) {
            return false;
        } else {
            return true;
        }


    }


    public static boolean areChildrenSymmetric(TreeNode left, TreeNode right) {

        boolean outerReflect;
        boolean innerReflect;
        if (left.val != right.val) {
            return false;
        }


        if (left.left != null && right.right != null) {
            outerReflect = areChildrenSymmetric(left.left, right.right);
        } else if (left.left == null && right.right == null) {
            outerReflect = true;
        } else {
            return false;
        }
        if (!outerReflect) {
            return false;
        }
        if (left.right != null && right.left != null) {
            innerReflect = areChildrenSymmetric(left.right, right.left);
        } else if (left.right == null && right.left == null) {
            innerReflect = true;
        } else {
            return false;
        }

        return innerReflect;
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

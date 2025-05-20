import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        TreeNode exampleOne = new TreeNode(
            1,
            null,
            new TreeNode(
                2,
                new TreeNode(3),
                null
            )
        );
        TreeNode exampleTwo = new TreeNode(
            1,
            new TreeNode(
                2,
                new TreeNode(
                    4
                ),
                new TreeNode(
                    5,
                    new TreeNode(
                        6
                    ),
                    new TreeNode(
                        7
                    )
                )
            ),
            new TreeNode(
                3,
                null,
                new TreeNode(
                    8,
                    new TreeNode(
                        9
                    ),
                    null
                )
            )
        );

        System.out.println(inorderTraversal(exampleOne));
        System.out.println(inorderTraversal(exampleTwo));

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root;
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        // s.add(current);

        while (current != null || !s.empty()) {
            // current = current.left;
            
            while (current != null) {
                s.add(current);
                current = current.left;
            }

            // current = s.pop();
            TreeNode top = s.pop();
            current = top.right;
            list.add(top.val);
            
        }
        return list;
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

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

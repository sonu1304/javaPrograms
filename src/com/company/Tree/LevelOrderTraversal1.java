package com.company.Tree;

public class LevelOrderTraversal1 {

    /**
     * Method 1 (Use function to print a current level)
     *
     * Algorithm:
     * There are basically two functions in this method. One is to print all nodes at a given level
     * (printCurrentLevel), and other is to print level order traversal of the tree (printLevelorder).
     * printLevelorder makes use of printCurrentLevel to print nodes at all levels one by one starting from the root.
     *
     * Time Complexity: O(n^2) in worst case. For a skewed tree, printGivenLevel() takes O(n) time
     * where n is the number of nodes in the skewed tree. So time complexity of
     * printLevelOrder() is O(n) + O(n-1) + O(n-2) + .. + O(1) which is O(n^2).
     *
     * Space Complexity: O(n) in worst case. For a skewed tree, printGivenLevel() uses O(n) space for call stack.
     * For a Balanced tree, the call stack uses O(log n) space, (i.e., the height of the balanced tree).
     */

    TreeNode root;

    public void printLevelOrder() {

        int height = height(root);

        int level;

        for (level = 1; level <= height; level++) {
            printCurrLevel(root, level);
        }

    }

    // calculate the height of the tree
    int height(TreeNode root) {

        if (root == null)
            return 0;

        else {

            //calculate the height of each subtree

            int left_height = height(root.left);
            int right_height = height(root.right);

            if (left_height > right_height)
                return left_height + 1;
            else return right_height + 1;

        }
    }

    void printCurrLevel(TreeNode root , int level) {

        if (root == null)
            return;
        if(level == 1)
            System.out.print(root.data + " ");

        else if (level > 1) {

            //print subtree
            printCurrLevel(root.left, level - 1);
            printCurrLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal1 tree = new LevelOrderTraversal1();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        tree.printLevelOrder();
    }
}

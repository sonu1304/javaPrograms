package com.company.Tree;


import java.util.LinkedList;
import java.util.Queue;

/**
 * Method 2 (Using queue)
 *
 * Algorithm:
 * For each node, first the node is visited and then it’s child nodes are put in a FIFO queue.
 *
 *
   Time Complexity: O(n) where n is the number of nodes in the binary tree
   Space Complexity: O(n) where n is the number of nodes in the binary tree
 */

public class LevelOrderTraversal2 {

    //creating queue

    TreeNode root;
    public void printLevelOrder() {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();
            System.out.print(currNode.data + " ");

            //checking for left and right child

            if (currNode.left != null) queue.add(currNode.left);
            if (currNode.right != null) queue.add(currNode.right);
        }
    }

    public static void main(String[] args) {
        LevelOrderTraversal2 tree = new LevelOrderTraversal2();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        tree.printLevelOrder();
    }

}

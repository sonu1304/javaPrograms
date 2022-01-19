package com.company.Tree;

/**
 * root -> left -> right
 *
 * o/p = 1 2 4 5 3
 */

public class PreOrderTraversal {

    TreeNode root;

    public static void printPreOrder(TreeNode node) {

        if (node == null) {
            return;
        }

        //printing root first
        System.out.print(node.data + " ");

        //recur left sub tree

        printPreOrder(node.left);

        //recur right subtree
        printPreOrder(node.right);
    }

    public static void main(String[] args) {

        PreOrderTraversal tree = new PreOrderTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        printPreOrder(tree.root);
    }
}

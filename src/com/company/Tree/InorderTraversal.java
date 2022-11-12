package com.company.Tree;

/**
 * left , root , right
 */

public class InorderTraversal {

    TreeNode root;

    public static void printInorder(TreeNode node) {

        if(node == null)
            return;

        //first recur on left subtree
        printInorder(node.left);

        //printing root

        System.out.print(node.data + " ");

        //then recur on right subtree
        printInorder(node.right);
    }

    public static void main(String[] args) {
        InorderTraversal tree = new InorderTraversal();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        printInorder(tree.root);
    }


}

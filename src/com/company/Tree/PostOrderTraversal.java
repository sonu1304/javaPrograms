package com.company.Tree;

/**
 * left -> right -> root
 *
 * o/p -> 4,5,2,3,1
 */

public class PostOrderTraversal {

    TreeNode root;

    public static void printPostOrder(TreeNode node) {
        if (node == null)
            return;

        //recur left subtree first
        printPostOrder(node.left);

        //then recur right subtree
        printPostOrder(node.right);

        //print root
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {

        PostOrderTraversal tree = new PostOrderTraversal();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        printPostOrder(tree.root);
    }
}

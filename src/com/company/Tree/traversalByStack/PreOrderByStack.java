package com.company.Tree.traversalByStack;

import com.company.Tree.TreeNode;

import java.util.Stack;

/**
 *
 * 1) Create an empty stack nodeStack and push root node to stack.
 * 2) push the root to the stack
 * 3) Do the following while nodeStack is not empty.
 * ….a) Pop an item from the stack and print it.
 * ….b) Push right child of a popped item to stack
 * ….c) Push left child of a popped item to stack
 *
 */

public class PreOrderByStack {

    public void preOrder(TreeNode root) {

        //create empty stack

        Stack<TreeNode> stack = new Stack();

        // pushing root to the stack

        stack.push(root);

        while (!stack.isEmpty()) {

            root = stack.pop();

            System.out.print(root.data);

            //pushing right child of the tree to the stack
            if( root.right != null) stack.push(root.right);

            //pushing left child of the tree to the stack
            if(root.left != null) stack.push(root.left);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        PreOrderByStack tree = new PreOrderByStack();
        tree.preOrder(root);

    }
}

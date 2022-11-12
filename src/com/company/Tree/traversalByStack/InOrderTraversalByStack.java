package com.company.Tree.traversalByStack;


import com.company.Tree.TreeNode;

import java.util.Stack;

/**
 *
 * 1) Create an empty stack S.
 * 2) Initialize current node as root
 * 3) Push the current node to S and set current = current->left until current is NULL
 * 4) If current is NULL and stack is not empty then
 *      a) Pop the top item from stack.
 *      b) Print the popped item, set current = popped_item->right
 *      c) Go to step 3.
 * 5) If current is NULL and stack is empty then we are done.
 *
 * Time Complexity: O(n)
 *
 */

public class InOrderTraversalByStack {

    public void printInOrder(TreeNode root) {

        if (root == null) return ;

        //creating empty stack

        Stack<TreeNode> stack = new Stack<>();

        // creating node and initializing it with root

        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()) {

            while(curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // pop the element from stack

            curr  = stack.pop();
            System.out.print(curr.data + " ");

            curr = curr.right;
        }
    }

}

package com.company.Tree.traversalByStack;

import com.company.Tree.TreeNode;

import java.util.Stack;

/**
 *
 * Postorder traversal can easily be done using two stacks, though. The idea is to push reverse postorder
 * traversal to a stack. Once we have the reversed postorder traversal in a stack, we can just pop all
 * items one by one from the stack and print them; this order of printing will be in postorder because of the
 * LIFO property of stacks. Now the question is, how to get reversed postorder elements in a stack – the second
 * stack is used for this purpose. For example, in the following tree, we need to get 1, 3, 7, 6, 2, 5, 4
 * in a stack. If take a closer look at this sequence, we can observe that this sequence is very similar
 * to the preorder traversal. The only difference is that the right child is visited before left child,
 * and therefore the sequence is “root right left” instead of “root left right”. So, we can do something
 * like iterative preorder traversal with the following differences:
 * a) Instead of printing an item, we push it to a stack.
 * b) We push the left subtree before the right subtree.
 *
 * Algo :
 *
 * 1. Push root to first stack.
 * 2. Loop while first stack is not empty
 *    2.1 Pop a node from first stack and push it to second stack
 *    2.2 Push left and right children of the popped node to first stack
 * 3. Print contents of second stack
 *
 */

public class PostOrderTwoStack {

    public void postOrder(TreeNode root) {

        if (root == null) return;

        //creating two empty stack

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        //push root to the first stack
        s1.push(root);

        //loop through the first stack until it is empty
        while (!s1.isEmpty()) {

            //pop from first stack and push it to second stack
            root = s1.pop();

            s2.push(root);

            //push left item of the popped item to first stack

            if (root.left != null) s1.push(root.left);

            //push right of the popped item to the first stack
            if(root.right != null) s1.push(root.right);
        }

        //now we have first stack empty and print the second stack

        while (!s2.isEmpty()) {
            root = s2.pop();
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        PostOrderTwoStack tree = new PostOrderTwoStack();
        tree.postOrder(root);
    }
}

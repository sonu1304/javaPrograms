package com.company.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeRightView {

    TreeNode root;

    public List<Integer> printRightView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode currNode = queue.poll();
                if(i==0) list.add(currNode.data);
                if(currNode.right != null) queue.offer(currNode.right);
                if(currNode.left != null) queue.offer(currNode.left);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeRightView tree = new TreeRightView();
        tree.root = new TreeNode(2);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(4);

        System.out.println(tree.printRightView(tree.root));

    }
}

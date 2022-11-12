package com.company.dailyCodingProblem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DailyCoding3 {
    TreeNode root;

    private static String NULL = "n";
    private static String DELI = ",";

    // serializing the tree
    public String getSerialized_data(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize( TreeNode root , StringBuilder sb) {
        if(root == null)
            sb.append(NULL).append(DELI);
        else {
            sb.append(root.val).append(DELI);
            serialize(root.left, sb);
            serialize(root.right, sb);
        }
    }

    // deserialize data

    public TreeNode getDeserialized_data(String data) {
        return deserialize(new LinkedList<>(Arrays.asList(data.split(DELI))));
    }

    private TreeNode deserialize(Queue<String> q) {
        String value = q.poll();
        if(value.equals(NULL))
            return null;
        else {
            TreeNode root = new TreeNode(Integer.valueOf(value));
            root.left = deserialize(q);
            root.right = deserialize(q);
            return root;
        }

    }

    // print the tree
    public void printPreOrder(TreeNode root) {
        if ( root == null )
            return;
        System.out.print(root.val + " ");

        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void main(String args[]) {
        DailyCoding3 tree = new DailyCoding3();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);

        DailyCoding3 serializeData = new DailyCoding3();

        DailyCoding3 deserializeData = new DailyCoding3();

        TreeNode resTree = deserializeData.getDeserialized_data(serializeData.getSerialized_data(tree.root));

        tree.printPreOrder(resTree);

    }

}

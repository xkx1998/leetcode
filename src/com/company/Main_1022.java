package com.company;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Main_1022 {
    int ans = 0;

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        fun(root, 0);
        return ans;
    }

    public void fun(TreeNode root, int sum) {
        sum = sum * 2 + root.val;
        if (root.left == null && root.right == null)
            ans += sum;
        if (root.left != null) fun(root.left, sum);
        if (root.right != null) fun(root.right, sum);
    }
}

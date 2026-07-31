class Solution {

    int ans = 0;

    public int findTilt(TreeNode root) {

        solve(root);

        return ans;
    }

    public int solve(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = solve(root.left);

        int right = solve(root.right);

        ans += Math.abs(left - right);

        return root.val + left + right;
    }
}
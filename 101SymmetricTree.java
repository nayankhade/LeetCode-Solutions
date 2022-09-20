class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode left1, TreeNode right1) {
        if (left1 == null && right1 == null) {
            return true;
        }
        if (left1 == null || right1 == null) {
            return false;
        }
        if (left1.val != right1.val) {
            return false;
        }
        return check(left1.left, right1.right) && check(left1.right, right1.left);
    }
}
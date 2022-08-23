class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> out_rr = new ArrayList<>();
        if (root == null) {
            return out_rr;
        }

        stack.push(root);
        while (!stack.isEmpty()) {

            root = stack.pop();
            out_rr.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return out_rr;
    }
}
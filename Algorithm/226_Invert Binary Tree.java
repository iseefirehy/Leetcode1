class Solution {
    TreeNode ans = null;
    public TreeNode invertTree(TreeNode root) {
        ans = root;
        helper(root);
        return ans;
    }
    private void helper(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        helper(root.left);
        helper(root.right);
    }
        
}
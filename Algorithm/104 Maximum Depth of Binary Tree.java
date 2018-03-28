// /**
// 2
//  * Definition for a binary tree node.
// 3
//  * public class TreeNode {
// 4
//  *     int val;
// 5
//  *     TreeNode left;
// 6
//  *     TreeNode right;
// 7
//  *     TreeNode(int x) { val = x; }
// 8
//  * }
// 9
//  */

class Solution {

    int sum = 0;
  public int maxDepth(TreeNode root) {

        helper(root,1);

        return sum;

    }

    private void helper(TreeNode root,int depth){

        if(root == null){

            return;

        }

        if(depth > sum){

            sum = depth;

        }

        helper(root.left,depth + 1);

        helper(root.right,depth + 1);       

    }

}


//divide and conquer
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }
}
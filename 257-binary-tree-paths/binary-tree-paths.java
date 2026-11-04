/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, "", ans);
        return ans;
    }
    private void dfs(TreeNode root, String s, List<String> ans){
        if(root == null) return;
        s = s.isEmpty() ? "" : s + "->";
        s = s + root.val;
        if(root.left == null && root.right == null){
            ans.add(s);
            return;
        }
        dfs(root.left, s, ans);
        dfs(root.right, s, ans);
    }
}
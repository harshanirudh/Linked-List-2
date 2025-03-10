//Time Complexity: O(1)
//Space Complexity:O(h)

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
class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack=new Stack<>();
        dfs(root);
    }
    
    public int next() {
        TreeNode root=stack.pop();
        dfs(root.right);
        return root.val;
    }
    
    public boolean hasNext() {
        return !stack.isEmpty();
    }
    
    private void dfs(TreeNode root){
        if(root == null)
            return;
        stack.push(root);
        System.out.println(root.val);
        dfs(root.left);
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */

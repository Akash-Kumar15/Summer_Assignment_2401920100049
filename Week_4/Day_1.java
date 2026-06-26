// Maximum depth of binary tree
class Solution {
    public int maxDepth(TreeNode root) {
       if(root==null) return 0;
       int level=1+Math.max(maxDepth(root.left),maxDepth(root.right));
       int depth=level+1;
       return depth; 
    }
}

// Invert binary tree
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        TreeNode l=root.left;
        TreeNode r=root.right;
        root.left=invertTree(r);
        root.right=invertTree(l);
        return root;
    }
}

// Same Tree
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        if(p==null && q==null) return true;
        if(p==null || q==null ) return false;
       if(p.val!=q.val) return false;
      return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

    }
}
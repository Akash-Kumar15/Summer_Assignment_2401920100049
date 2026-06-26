// Binary tree inorder traversal
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) 
    {  
       List <Integer> arr=new ArrayList<>();
       TreeNode curr=root;
       while(curr!=null)
       {
        if(curr.left!=null)
        {
            TreeNode pred=curr.left;
            while(pred.right!=null && pred.right!=curr)
            {
                pred=pred.right;
            }
            if(pred.right==null)
            {
                pred.right=curr;
                curr=curr.left;
            }
            if(pred.right==curr)
            {
                pred.right=null;
                arr.add(curr.val);
                curr=curr.right;
            }
        }
        else
        {
             arr.add(curr.val);
             curr=curr.right;
        }
       }
       return arr;
        
    }
}

// Binary tree level order traveral
class Solution {
    public int height(TreeNode root)
    {
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nlevel(TreeNode root,int n,List<Integer> arr)
    {
        if(root==null) return;
        if(n==1)
        {
            arr.add(root.val);
            return;
        }
        nlevel(root.left,n-1,arr);
        nlevel(root.right,n-1,arr);
    }
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        int level=height(root)+1;
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        for(int i=1;i<=level;i++)
        {
            List<Integer> arr=new ArrayList<>();
            nlevel(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}

// Binary tree zigzag level order traversal
class Solution {
    public int height(TreeNode root)
    {
        if(root==null || root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void nlevel(TreeNode root,int n,List<Integer> arr)
    {
        if(root==null) return;
        if(n==1)
        {
            arr.add(root.val);
            return;
        }
         nlevel(root.left,n-1,arr);
         nlevel(root.right,n-1,arr);
    }
     public void nlevel2(TreeNode root,int n,List<Integer> arr)
    {
        if(root==null) return;
        if(n==1)
        {
            arr.add(root.val);
            return;
        }
         nlevel2(root.right,n-1,arr);
         nlevel2(root.left,n-1,arr);
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level=height(root)+1;
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        for(int i=1;i<=level;i++)
        {
            List<Integer> arr=new ArrayList<>();
            if(i%2!=0) nlevel(root,i,arr);
            else nlevel2(root,i,arr);
            ans.add(arr);
        }
        return ans;
    }
}
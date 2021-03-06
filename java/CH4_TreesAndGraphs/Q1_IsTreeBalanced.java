package CH4_TreesAndGraphs;

import CtCILibrary.TreeNode;

public class Q1_IsTreeBalanced {

    public int maxDepth(TreeNode n) {
        if (n == null) return 0;
        return 1 + Math.max(maxDepth(n.left), maxDepth(n.right));
    }

    public int minDepth(TreeNode n) {
        if (n == null) return 0;
        return 1 + Math.min(minDepth(n.left), minDepth(n.right));
    }

    public boolean isBalanced(TreeNode n) {
        return maxDepth(n) - minDepth(n) <= 1;
    }

}

package leetCodeEasy;

import java.util.ArrayList;
import java.util.List;

public class binaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> treeNodeValues = new ArrayList<>();
        TreeNode nodeToCheck = root;
        int iterations = 0;
        List<TreeNode> treeNodeList = new ArrayList<>();
        while(true){
            treeNodeList.add(nodeToCheck);
            if(nodeToCheck.left == null){
                treeNodeValues.add(nodeToCheck.val);
                nodeToCheck = nodeToCheck.right;
            }else{
                nodeToCheck = nodeToCheck.left;
                iterations++;
                continue;
            }
            boolean iterating = true;
            while(iterating) {
                if (nodeToCheck.right == null) {
                    nodeToCheck = treeNodeList.get(iterations);
                } else {
                    nodeToCheck = nodeToCheck.right;
                    iterating = false;
                    continue;
                }
                treeNodeValues.add(nodeToCheck.val);
                nodeToCheck = treeNodeList.get(iterations - 1);
            }

            iterations++;
        }
    }
}

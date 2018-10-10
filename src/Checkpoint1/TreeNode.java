package Checkpoint1;

/**
 * Created by Tal on 7/11/2018.
 */
public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode(TreeNode left, TreeNode right, int data){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public TreeNode(int data){
        this.left = null;
        this.right = null;
        this.data = data;
    }

    public TreeNode getLeft(){
        return left;
    }

    public TreeNode getRight(){
        return right;
    }

    public int getData(){
        return data;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}

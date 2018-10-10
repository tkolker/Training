package Checkpoint1;

/**
 * Created by Tal on 7/11/2018.
 */
public class BSTree {
    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode insert(TreeNode root, int data){

        if(root == null){
            root = new TreeNode(data);
            return root;
        }

        if(data < root.getData())
            root.setLeft(insert(root.getLeft(), data));

        else if (data > root.getData())
            root.setRight(insert(root.getRight(), data));

        return root;
    }

    public TreeNode search(TreeNode root, int data){
        if(root == null || root.getData() == data){
            return root;
        }

        if(root.getData() > data){
            return search(root.getLeft(), data);
        }

        return search(root.getRight(), data);
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}

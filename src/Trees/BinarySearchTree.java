package Trees;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree(){
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public Node insert(Node root, Node n){
        if(root == null){
            root = n;
        }
        else{
            if(n.getVal() < root.getVal()) {
                root.setLeft(insert(root.getLeft(), n));
                root.setSizeL(root.getSizeL() + 1);
            }
            else {
                root.setRight(insert(root.getRight(), n));
                root.setSizeR(root.getSizeR() + 1);
            }
        }

        return root;
    }

    public void buildBSTree(int[] keys){
        for(int key: keys){
            root = insert(root, new Node(key));
        }
    }
}

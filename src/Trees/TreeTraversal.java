package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TreeTraversal {

    public void printInOrder(Node root) {
        if(root == null){
            return;
        }

        printInOrder(root.getLeft());
        System.out.print(root.getVal());
        printInOrder(root.getRight());
    }

    public void printPostOrder(Node root) {
        if(root == null){
            return;
        }

        printPostOrder(root.getLeft());
        printPostOrder(root.getRight());
        System.out.print(root.getVal());
    }

    public void printPreOrder(Node root) {
        if(root == null){
            return;
        }

        System.out.print(root.getVal());
        printPreOrder(root.getLeft());
        printPreOrder(root.getRight());
    }

    public void printByLevels(Node root){
        int height = height(root);
        for(int i = 0; i < height; i++){
            printByLevelsUtil(root,i);
        }
    }

    private int height(Node root) {
        if(root == null)
            return 0;

        return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
    }

    public void printByLevelsUtil(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 0){
            System.out.print(root.getVal());
            return;
        }

        printByLevelsUtil(root.getLeft(), level-1);
        printByLevelsUtil(root.getRight(), level-1);

    }

    public Node findElement(Node root, int i){
        if(root == null)
            return null;

        int val = root.getVal();
        if(val == i){
            return root;
        }

        if(i < val)
            return findElement(root.getLeft(), i);
        return findElement(root.getRight(), i);
    }

    public void printKElement(Node root, int k){
        if(root == null) {
            return;
        }
        if(root.getSizeL() + root.getSizeR() == k - 1){
            System.out.println(root.getVal());
        }

        printKElement(root.getLeft(), k);
        printKElement(root.getRight(), k- root.getSizeL());


    }

    public HashMap<Node, ArrayList<Node>> toAdjacentList(Node root){
        HashMap<Node, ArrayList<Node>> tree = new HashMap<>();

        if(root == null){
            return tree;
        }

        convertToList(root, tree);
        return tree;
    }

    private void convertToList(Node n, HashMap<Node, ArrayList<Node>> tree) {
        if(n == null){
            return;
        }
        ArrayList<Node> sons = new ArrayList<>();

        if(n.getRight() != null)
            sons.add(n.getRight());

        if(n.getLeft() != null)
            sons.add(n.getLeft());

        tree.put(n, sons);

        convertToList(n.getLeft(), tree);
        convertToList(n.getRight(), tree);
    }

    public void BFSTraversal(HashMap<Node, ArrayList<Node>> tree){
        
    }





}

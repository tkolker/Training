package Trees;

import java.util.ArrayList;
import java.util.HashMap;

public class Program {
    public static void main(String[] args){
        int[] arr = { 5,2,8,3,4,6,7,9,1,0};
        TreeTraversal tp = new TreeTraversal();
        BinarySearchTree bst = new BinarySearchTree();
        bst.buildBSTree(arr);
        /*
        tp.printInOrder(bst.getRoot());
        newline();
        tp.printPreOrder(bst.getRoot());
        newline();
        tp.printPostOrder(bst.getRoot());
        newline();
        tp.printByLevels(bst.getRoot());
        newline();
        printNode(tp.findElement(bst.getRoot(), 55));
        print(bst.getRoot().getSizeL());
        print(bst.getRoot().getSizeR());
        tp.printKElement(bst.getRoot(), 6);
        */

        HashMap<Node, ArrayList<Node>> adjacentList = tp.toAdjacentList(bst.getRoot());
        print(2);
    }

    public static void printNode(Node n){
        if(n == null)
            System.out.println("null");
        else
            System.out.println(n.getVal());
    }

    public static void newline(){
        System.out.println();
    }

    public static void print(int i){
        System.out.println(i);
    }


}

package Checkpoint1;

/**
 * Created by Tal on 7/11/2018.
 */
public class Program {
    public static void main(String[] args){
        int[] arr = { 2,7,3,4,9,5,1 };
        BSTree tree = new BSTree();

        for (int i:arr) {
            tree.setRoot(tree.insert(tree.getRoot(), i));
        }

        TreeNode tn = tree.search(tree.getRoot(), 4);
        System.out.println(tn.getData());
    }

}

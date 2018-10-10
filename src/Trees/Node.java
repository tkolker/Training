package Trees;

class Node {
    private int val;
    private Node left;
    private Node right;
    private int sizeL;
    private int sizeR;

    public Node(int n){
        val = n;
        left = right = null;
        sizeL = 0;
        sizeR = 0;
    }


    public int getSizeL() {
        return sizeL;
    }

    public int getSizeR() {
        return sizeR;
    }

    public void setSizeL(int sizeL) {
        this.sizeL = sizeL;
    }

    public void setSizeR(int sizeR) {
        this.sizeR = sizeR;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
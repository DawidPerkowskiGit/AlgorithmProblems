package org.example.binarytreeserializer;

public class Node {
    public String val;
    public Node left;
    public Node right;

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
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

    public Node() {}

    public Node(String val) {
        this.val = val;
    }

    public Node(String val, Node left, String right) {
        this.val = val;
        this.left = left;
    }

    public Node(String val, String left, Node right) {
        this.val = val;
        this.right = right;
    }

    public Node(String val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

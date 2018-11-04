package org.zj.tree;

/**
 * @BelongsProject: binary_tree
 * @BelongsPackage: org.zj.tree
 * @Author: ZhangJun
 * @CreateTime: 2018/11/3
 * @Description: ${Description}
 */
public class Node {
    private String k;
    private Integer val;
    private Node left;
    private Node right;

    public Node(String k, Integer val) {
        this.k = k;
        this.val = val;
    }

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
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

    @Override
    public String toString() {
        return "Node{" +
                "k=" + k +
                ", val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

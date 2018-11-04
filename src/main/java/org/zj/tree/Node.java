package org.zj.tree;

/**
 * @BelongsProject: binary_tree
 * @BelongsPackage: org.zj.tree
 * @Author: ZhangJun
 * @CreateTime: 2018/11/3
 * @Description: ${Description}
 */
public class Node<K,V extends Comparable<V>> {
    private K k;
    private V val;
    private Node left;
    private Node right;

    public Node(K k, V val) {
        this.k = k;
        this.val = val;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getVal() {
        return val;
    }

    public void setVal(V val) {
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

package org.zj.tree;

/**
 * @BelongsProject: binary_tree
 * @BelongsPackage: org.zj.tree
 * @Author: ZhangJun
 * @CreateTime: 2018/11/3
 * @Description: ${Description}
 */
public class Content {
    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.insert("zz",5);
        tree.insert("z",3);
        tree.insert("er",2);
        tree.insert("t",4);
        tree.insert("t",6);

        System.out.println("========");
        tree.eachLayer();
        tree.search("z");

        tree.search(3);
    }
}

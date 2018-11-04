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
        tree.insert("zz",new Val(88));
        tree.insert("z",new Val(15));
        tree.insert("er",new Val(34));
        tree.insert("t",new Val(92));

        System.out.println("========");
        tree.eachLayer();
    }
}

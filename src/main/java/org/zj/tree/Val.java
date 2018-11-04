package org.zj.tree;

/**
 * @BelongsProject: binary_tree
 * @BelongsPackage: org.zj.tree
 * @Author: ZhangJun
 * @CreateTime: 2018/11/4
 * @Description: ${Description}
 */
public class Val implements Comparable {
    private Integer val;
    public Val(Integer val){
        this.val=val;
    }
    public int compareTo(Object o) {
        Val v= (Val) o;
        return this.val-v.val;
    }

    @Override
    public String toString() {
        return "Val{" +
                "val=" + val +
                '}';
    }
}

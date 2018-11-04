package org.zj.tree;

/**
 * @BelongsProject: binary_tree
 * @BelongsPackage: org.zj.tree
 * @Author: ZhangJun
 * @CreateTime: 2018/11/3
 * @Description: ${Description}
 */
public class Tree {
    private Node root;
    public void insert(String k,Integer v){
        //先判断root是否为空
        if(root==null){
            root=new Node(k,v);
            System.out.println("直接插到根 ");
            return;
        }

        //接下来遍历节点
        Node node = new Node(k, v);
        forInsert(node,root);
        System.out.println("--------------------------------");
    }

    //递归遍历，然后插入数值
    private int forInsert(Node insertNode, Node node) {
        //百度百科上说键值不能相等
        if(insertNode.getVal().equals(node.getVal()))
            return -1;


        //判断都空的
        if(node.getLeft()==null&&node.getRight()==null){
            System.out.println("两边都空");
            //判断这个数值和当前节点的大小
            if(node.getVal().compareTo(insertNode.getVal())>=0){
                System.out.println("    插入到"+node.getVal()+"的左边"+insertNode.getVal());
                node.setLeft(insertNode);
                return 0;
            }
            if(node.getVal().compareTo(insertNode.getVal())<=0){
                System.out.println("    插入到右边");
                node.setRight(insertNode);
                return 0;
            }
        }

        //判断要插入的值是否比当前的节点大
        if(node.getVal().compareTo(insertNode.getVal())>=0){
            if(node.getLeft()!=null){
                return forInsert(insertNode,node.getLeft());
            }
            //不然直接insert
            node.setLeft(insertNode);
            return 0;
        }
        if(node.getVal().compareTo(insertNode.getVal())<=0){
            if(node.getRight()!=null){
                return forInsert(insertNode,node.getRight());
            }
            //不然直接insert
            node.setRight(insertNode);
            return 0;
        }
        return -1;
    }
    //按层遍历
    public void eachLayer(){
        System.out.println(root.getVal());
        layEach(root);
    }

    /**
     *     5
     *   /  \
     * 4    6
     *  \
     *   5
     * @param node
     *
     */
    //广度优先(按层遍历里面的递归)
    private void layEach(Node node) {
        if(node.getLeft()!=null){
            System.out.println("L  "+node.getLeft().getVal());
        }
        if(node.getRight()!=null){
            System.out.println("R  "+node.getRight().getVal());
        }

        if(node.getLeft()!=null){
            layEach(node.getLeft());
        }
        if(node.getRight()!=null){
            layEach(node.getRight());
        }

    }

    //深度优先(先序遍历)
    public void beforeEach(){
        eachBefore(root);
    }

    //递归先序遍历
    private void eachBefore(Node node) {
        System.out.println(node.getVal());

        if(node.getLeft()!=null)
            eachBefore(node.getLeft());

        if(node.getRight()!=null)
            eachBefore(node.getRight());
    }

    public void afterEach(){
        eachAfter(root);
    }

    //递归后序遍历
    private void eachAfter(Node node) {
        System.out.println(node.getVal());

        if(node.getRight()!=null)
            eachBefore(node.getRight());

        if(node.getLeft()!=null)
            eachBefore(node.getLeft());

    }

    /**
     * 遍历树来搜索
     * @param
     */
    public void search(Integer val){
        //深度优先来遍历
        doSearchValue(0,root,val);
    }

    //搜索key
    public void search(String key){
        doSearchKey(0,root,key);
    }

    private void doSearchKey(int count, Node node, String key) {
        count++;
        if(node.getK().equals(key)){
            System.out.println("我找到了，用了"+count+"  次");
            return;
        }

        if(node.getLeft()!=null)
            doSearchKey(count,node.getLeft(),key);

        if(node.getRight()!=null)
            doSearchKey(count,node.getRight(),key);

    }


    /**
     * 递归搜索数值
     * @param node
     * @param
     */
    private void doSearchValue(int count, Node node, Integer val) {
        count++;

        System.out.println(node.getVal()+"  "+val);

        if(node.getVal()==val){
            System.out.println("我找到了:"+node.getVal()+"用了"+count+"  次");
            return;
        }
        if(node.getLeft()!=null)
            doSearchValue(count,node.getLeft(),val);

        if(node.getRight()!=null)
            doSearchValue(count,node.getRight(),val);

    }





}

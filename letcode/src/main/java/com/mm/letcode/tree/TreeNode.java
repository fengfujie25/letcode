package com.mm.letcode.tree;

import lombok.Data;

/**
 * 树的节点
 * @auther: fujie.feng
 * @DateT: 2019-07-25
 */
@Data
public class TreeNode {

    private int value;

    private TreeNode leftNode;

    private TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
        this.leftNode = null;
        this.rightNode = null;
    }

    public TreeNode(){

    }
    /**
     * 添加节点
     * @param root
     * @param data
     * @return
     */
    public TreeNode add(TreeNode root, int data) {
        TreeNode current = new TreeNode(data);
        if (root == null) {
            return current;
        }
        //当前节点的value小于data，插入右子节点
        if (root.value < data) {
            if (root.rightNode != null) {
                root.rightNode = add(root.rightNode, data);
            } else {
                root.rightNode = current;
            }
        } else {
            if (root.leftNode != null) {
                root.leftNode = add(root.leftNode, data);
            } else {
                root.leftNode = current;
            }
        }
        return root;
    }

}

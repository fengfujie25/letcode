package com.mm.letcode.tree;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-25
 */
public class DemoTest {

    public static void main(String[] args) {
        GeneralBinaryTree generalBinaryTree = new GeneralBinaryTree();
        TreeNode node = generalBinaryTree.initTree(new int[]{4,6,3,7,9,5,8,11,15});
        System.out.println(generalBinaryTree.getNodeNumsForKLevel(node, 3));
    }
}

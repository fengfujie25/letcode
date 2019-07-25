package com.mm.letcode.tree;

/**
 * @auther: fujie.feng
 * @DateT: 2019-07-25
 */
public class GeneralBinaryTree extends AbstractBinaryTreeFactory {

    protected AbstractBinaryTreeFactory factory() {
        return new GeneralBinaryTree();
    }

    protected TreeNode add(TreeNode node, int value) {
        TreeNode current = new TreeNode(value);

        if (node == null) {
            return current;
        }

        if (node.getValue() < value) {
            if (node.getRightNode() != null) {
                node.setRightNode(add(node.getRightNode(), value));
            } else {
                node.setRightNode(current);
            }
        } else {
            if (node.getLeftNode() != null) {
                node.setLeftNode(add(node.getLeftNode(), value));
            } else {
                node.setLeftNode(current);
            }
        }
        return node;
    }
}
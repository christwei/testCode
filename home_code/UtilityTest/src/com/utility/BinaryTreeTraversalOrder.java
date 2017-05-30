package com.utility;

public class BinaryTreeTraversalOrder {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] array = { 35, 76, 12, 22, 16, 48, 90, 46, 9, 40 };
        BinaryTree root = new BinaryTree(array[0]); // 创建二叉树
        for (int i = 1; i < array.length; i++) {
            root.insert(root, array[i]); // 向二叉树中插入数据
        }
        System.out.println(Messages.getString("BinaryTreeTraversalOrder.0")); //$NON-NLS-1$
        preOrder(root);
        System.out.println();
        System.out.println(Messages.getString("BinaryTreeTraversalOrder.1")); //$NON-NLS-1$
        inOrder(root);
        System.out.println();
        System.out.println(Messages.getString("BinaryTreeTraversalOrder.2")); //$NON-NLS-1$
        postOrder(root);
    }

    public static void preOrder(BinaryTree root) { // 先根遍历
        if (root != null) {
            System.out.print(root.data + Messages.getString("BinaryTreeTraversalOrder.3")); //$NON-NLS-1$
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(BinaryTree root) { // 中根遍历

        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + Messages.getString("BinaryTreeTraversalOrder.4")); //$NON-NLS-1$
            inOrder(root.right);
        }
    }

    public static void postOrder(BinaryTree root) { // 后根遍历

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + Messages.getString("BinaryTreeTraversalOrder.5")); //$NON-NLS-1$
        }
    }

}

class BinaryTree {

    int data; // 根节点数据
    BinaryTree left; // 左子树
    BinaryTree right; // 右子树

    public BinaryTree(int data) // 实例化二叉树类
    {
        this.data = data;
        left = null;
        right = null;
    }

    
    /**
     * 向二叉树中插入子节点
     * @param root
     * @param data
     */
    public void insert(BinaryTree root, int data) { // 
        if (data > root.data) // 二叉树的左节点都比根节点小
        {
            if (root.right == null) {
                root.right = new BinaryTree(data);
            } else {
                this.insert(root.right, data);
            }
        } else { // 二叉树的右节点都比根节点大
            if (root.left == null) {
                root.left = new BinaryTree(data);
            } else {
                this.insert(root.left, data);
            }
        }
    }
}
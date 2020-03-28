/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public TreeNode root;
    int count;

    public MyBinarySearchTree() {
        root = null;
    }

    public void insert(int val) {
        TreeNode newnode = new TreeNode();
        newnode.setData(val);
        if (root == null) {
            root = newnode;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (current.getData() > val) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newnode);
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newnode);
                        return;
                    }
                }

            }

        }


    }

    public void printleft(TreeNode root) {
        if (root == null) {
            return;
        } else {

            if (root.getLeft() != null) {
                System.out.print(root.getLeft().getData() + " ");
            } else {
                count++;

            }
        }
        printleft(root.getLeft());
        printleft(root.getRight());
    }

    public int getCount() {
        return count;
    }

    public void postorder(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getData() + " ");


        }
    }

    public void preOrder(TreeNode root) {
    }

    public void postOrder(TreeNode root) {
    }
}

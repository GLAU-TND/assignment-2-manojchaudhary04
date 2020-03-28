/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;
import problem5.node.Node;

public class MyQueue {
    Node front = null;
    Node rear = null;

    public void enqueue(int val) {
        Node newnode = new Node();
        newnode.setData(val);
        if (front == null) {
            front = newnode;
            rear = newnode;
        } else {
            rear.setNext(newnode);
            rear = newnode;
        }
    }

    public void getpreordersuccessor(TreeNode root) {
        if (root == null) {
            return;
        }
        enqueue(root.getData());
        getpreordersuccessor(root.getLeft());
        getpreordersuccessor(root.getRight());

    }

    void printNodes() {
        Node temp = front.getNext();
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public void preOrderSucc(TreeNode root) {
    }

    public void dispPreOrderSucc() {
    }
}

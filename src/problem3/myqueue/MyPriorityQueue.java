/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;
import problem5.student.Student;

public class MyPriorityQueue {
    Node head = null;

    public void insert(int rollno, String name) {
        Student obj = new Student();
        obj.setName(name);
        obj.setRoll(rollno);
        Node node = new Node();
        node.setStudent(obj);
        Node temp = head;

        if (head == null) {
            head = node;
        } else if (head.getStudent().getRoll(rollno)) {
            node.setNode(head);
            head = node;


        } else {
            while (temp.getNode() != null && temp.getStudent().getRoll(rollno)) {

                temp = temp.getNode();

            }
            node.setNode(temp);
            temp.setNode(node);

        }


    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.getStudent().getName() + " " + temp.getStudent().getRoll());
            temp = temp.getNode();
        }
    }
}

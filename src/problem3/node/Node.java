/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

import problem5.student.Student;

public class Node {
    private Student student;
    private Node next;

    Node(Student student) {
        this.student = student;
        this.next = null;
    }

    public Node() {

    }

    public Node getNode() {
        return next;
    }

    public void setNode(Node node) {
        this.next = node;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void setData(int val) {
    }

    public void setNext(Node newnode) {
    }

    public Node getNext() {
        return null;
    }

    public void getData() {
    }

}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert(33, "Manoj");
        obj.insert(32, "Kashish");
        obj.insert(31, "Parth");
        obj.insert(30, "Hardik");
        obj.insert(21, "Harshit");
        obj.print();


    }
}

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    String Name;
    int roll;
    int acount;
    int backlog;

    public Student() {
    }

    ;

    public Student(int roll, int backlog, int acount) {
        this.roll = roll;
        this.acount = acount;
        this.backlog = backlog;
    }

    public int getAcount() {
        return acount;
    }

    public int getBacklog() {
        return backlog;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }


    public boolean getRoll(int rollno) {
        return false;
    }
}

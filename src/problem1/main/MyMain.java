/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(20);
        obj.insert(100);
        obj.insert(40);
        obj.insert(60);
        obj.insert(3);

        obj.insert(8);

        obj.insert(77);
        System.out.println("post order traversl");
        obj.postorder(obj.root);

        System.out.println();
        System.out.println("left values traversl");

        obj.printleft(obj.root);
        System.out.println("nodes not having left nodes");

        System.out.println(obj.getCount());

    }
}


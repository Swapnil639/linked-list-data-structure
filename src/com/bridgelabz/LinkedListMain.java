package com.bridgelabz;

import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List program");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(56);
        list.add(30);
        list.add(70);
        System.out.println("Simple Linked list is : " + list);

        LinkedListFunctions linkedListFunctions = new LinkedListFunctions();
        System.out.println("Elements added in the list are:");
        linkedListFunctions.addFirst(56);
        linkedListFunctions.appendingNode(56, 30);
        linkedListFunctions.appendingNode(30, 70);
        linkedListFunctions.printList();
    }
}


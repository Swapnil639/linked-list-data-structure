package com.bridgelabz;

public class LinkedListFunctions {
    Node head;
    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if(head ==null) {
            head = newNode;
            return;
        }
        newNode.next =head;
        head=newNode;
    }
    //print
    public void printList(){

        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
}

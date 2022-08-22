package com.bridgelabz.hashtable;

public class LinkedList<T extends Comparable<T>> {
    Node<T> head;
    Node<T> tail;
    //Insert Data from Last
    public void insertNode(T key) {
        Node<T> newNode = new Node<T>(key);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    //Display Node in Linked List
    public void showLinkedList() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.key + " : " + temp.value +" -> ");
                temp = temp.next;
            }
        }
    }

    public boolean findNode(T findKey) {
        Node<T> temp = head;
        while (temp != null) {
            if (temp.key.compareTo(findKey) == 0) {
                temp.value++;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
package com.bridgelabz.hashtable;
class Node <T extends Comparable<T>> {
    public T key;
    public int value;
    public Node next;

    //Node Constructor for Creating New Node
    Node(T key) {
        this.key = key;
        this.value = 1;
        this.next = null;
    }
}
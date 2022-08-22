package com.bridgelabz.hashtable;


import java.util.Hashtable;
import java.util.Scanner;

import java.util.ArrayList;
public class HashTableExp<T extends Comparable<T>> {

    private final int m;

    ArrayList<LinkedList<T>> myHashTableList;

    HashTableExp() {
        this.m = 10;
        this.myHashTableList = new ArrayList<LinkedList<T>>(m);
        for(int i=0;i<m;i++){
            this.myHashTableList.add(null);
        }
    }

    //Method to get index for Element
    public int myHashFunction(T k) {
        int index = Math.abs(k.hashCode()) % m;
        return index;
    }

    //Method to Store Node in Linked List
    public void storeKey(int index,T mystr) {
        LinkedList ll = myHashTableList.get(index);
        if(ll == null) {
            ll = new LinkedList();
            ll.insertNode(mystr);
            myHashTableList.set(index,ll);
        } else {
            if(!ll.findNode(mystr)){
                ll.insertNode(mystr);
            }
        }
    }

    //Method to Show Linked List Data
    public void showHashList() {
        for(int i=0;i<m;i++) {
            LinkedList ll = myHashTableList.get(i);
            if(ll != null) {
                System.out.print("\n "+ i +" => ");
                ll.showLinkedList();
            }
        }
    }

}
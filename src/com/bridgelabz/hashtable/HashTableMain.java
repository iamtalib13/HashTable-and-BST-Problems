package com.bridgelabz.hashtable;

public class HashTableMain {
    public static void main(String[] args) {
        //HashTableExp Object for Generic Type
        HashTableExp<String> hashTableExp = new HashTableExp<>();

        String str = "to be or not to be that to not be or";

        String strArr[] = str.split(" ");


        //Passing Array Element in HashTable Index
        for(String mystr : strArr) {
            //Get index of each object
            int index = hashTableExp.myHashFunction(mystr);
            //Store Element in Hash Table at given index
            hashTableExp.storeKey(index,mystr);
        }

        //Methode to Show Hash Table Data
        hashTableExp.showHashList();
    }
}
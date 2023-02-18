package com.vervyle;

import com.vervyle.containers.MyLinkedList;
import com.vervyle.containers.MyList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.remove(Integer.valueOf(3));
        myList.remove(Integer.valueOf(1));
        myList.remove(Integer.valueOf(2));
        Iterator<Integer> iterator = myList.iterator();
        iterator.forEachRemaining(integer -> System.out.print(integer + " "));
    }
}
package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newList = new LinkedList<>();
        for(int item:sourceList){
            if(item%2 !=0){newList.addFirst(item);}
            else{newList.addLast(item);}
        }
        return newList;
    }
}

package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newList = new ArrayList<>();
        for(int i = 2; i<sourceList.size(); i+=3){
            newList.add(sourceList.get(i));
            newList.add(sourceList.get(i));
        }
        return newList;
    }
}

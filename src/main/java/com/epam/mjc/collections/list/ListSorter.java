package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
        //String min = sourceList.get(0);
//        for(int i= 0; i< sourceList.size(); i++){
//            String min = sourceList.get(i);
//            for(int j = i+1; j<sourceList.size(); j++){
//                int val = ListComparator.compare("1","2");
//            }
//        }

    }
}

class ListComparator implements Comparator<String> {
    @Override
    public  int compare(String a, String b) {
        int v1 = 5*Integer.parseInt(a)* Integer.parseInt(a) + 3;
        int v2 = 5*Integer.parseInt(b)* Integer.parseInt(b) + 3;
        int value= v1 - v2;
        return Integer.compare(value, 0);

    }
}

package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public  int compare(String a, String b) {
        int v1 = 5*Integer.parseInt(a)* Integer.parseInt(a) + 3;
        int v2 = 5*Integer.parseInt(b)* Integer.parseInt(b) + 3;
        int value= v1 - v2;
        if(value > 0){
            return 1;
        }
        else if(value < 0){return -1;}
        else{
            if( Integer.parseInt(a)> Integer.parseInt(b)){return 1;}
            else{return -1;}
        }
        //return Integer.compare(value, 0);

    }
}

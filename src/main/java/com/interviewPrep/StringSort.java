package com.interviewPrep;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public String strigSort() {
        String[] str = {"Jan","feb","mar"};
        Arrays.sort(str,String.CASE_INSENSITIVE_ORDER);
        for (String i:str) {
            System.out.println(i);
        }
        List<String> list = Arrays.asList(str);
        Collections.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (String i: list) {
            System.out.println(i);
        }
        return str.toString();
    }
}

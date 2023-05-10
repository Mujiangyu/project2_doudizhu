package com.niit.test;

import java.util.*;

public class Test4 {
    public static void main(String[] args) {
        /*
        * 集合的嵌套
        * */

        HashMap<String, ArrayList<String>> hm = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list,"nanjing","yangzhou","suzhou","wuxi","changzhou");
        Collections.addAll(list1,"wuhan","xiaogan","shiyan","yichang","ezhou");
        Collections.addAll(list2,"shijiazhuang","tangshan","xingtai","baoding","zhangjiakou");
        hm.put("jiangsu",list);
        hm.put("hubei",list1);
        hm.put("hebei",list2);

        Set<Map.Entry<String, ArrayList<String>>> entries = hm.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
            StringJoiner sj = new StringJoiner(",","","");
            for (String s : value) {
                sj.add(s);
            }
            System.out.println(key + " = "+sj);
        }


    }
}

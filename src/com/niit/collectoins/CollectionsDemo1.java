package com.niit.collectoins;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
//集合的批量添加，使用工具类Collections中的addAll方法
        Collections.addAll(list,"norman","meimei","qianqian");
        System.out.println(list);
//打乱集合中的元素
        Collections.shuffle(list);
        System.out.println(list);

















    }
}

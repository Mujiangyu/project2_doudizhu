package com.niit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*
        * 班级里有n个学生，属性为：姓名，年龄，性别
        * 实现随机点名
        * */

        ArrayList<String> list  = new ArrayList<>();
        Collections.addAll(list,"norman","meimei","qianqian","xiaozheng","laoxu","qingshan","lover");

        /*Random r = new Random();
        int index = r.nextInt(list.size());
        System.out.println(list.get(index));*/
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}

package com.niit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*
         * 班级里有五位学生
         * 要求
         * 被点到名的学生不会被再次点到
         * 但如果班级里的所有学生都点完了，需要重新开始第二轮点名
         * */
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list, "norman", "qianqian", "qingshan", "meimei", "xiaozheng", "laoxu", "dongmei");
        Random r = new Random();
        for (int j = 0; j < 10; j++) {
            System.out.println("============第" + j + 1 + "轮点名====================");
            int length = list.size();
            for (int i = 0; i < length; i++) {
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            list.addAll(list2);
            list2.clear();
        }
    }
}

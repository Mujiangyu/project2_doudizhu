package com.niit.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /*
        * 班级里有N个学生
        * 要求：
        * 70%的概率随机到男生
        * 30%的概率随机到女生
        *
        * */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.shuffle(list);

        //从list集合中随机抽取0和1
        Random r = new Random();
        int index = r.nextInt(list.size());
        Integer i = list.get(index);

        //创建两个集合，分别存储男女生的名字
        ArrayList<String> boy = new ArrayList<>();
        Collections.addAll(boy,"boy1","boy2","boy3","boy4");
        ArrayList<String> girl = new ArrayList<>();
        Collections.addAll(girl,"girl1","girl2","girl3");

        if(i==1){
            Collections.shuffle(boy);
            System.out.println(boy.get(0));
        }else{
            Collections.shuffle(girl);
            System.out.println(girl.get(0));
        }


    }
}

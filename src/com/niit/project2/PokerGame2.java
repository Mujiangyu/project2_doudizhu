package com.niit.project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame2 {

    static HashMap<Integer,String> hm =new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

   static {
       String[] color = {"♦", "♣", "♥", "♠"};
       String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

       int seriaNumber = 1;
       for (String n : number) {
           for (String c : color) {
               hm.put(seriaNumber,c+n);
               list.add(seriaNumber);
               seriaNumber++;
           }
       }
       hm.put(seriaNumber,"小王");
       list.add(seriaNumber);
       seriaNumber++;
       hm.put(seriaNumber,"大王");
       list.add(seriaNumber);
       System.out.println(list);

   }

    public PokerGame2(){
       //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        //遍历牌盒，得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            Integer numeric = list.get(i);
            if (numeric <= 3) {
                lord.add(numeric);
            } else if (numeric % 3 == 0) {
                player1.add(numeric);

            } else if (numeric % 3 == 1) {
                player2.add(numeric);

            } else {
                player3.add(numeric);

            }
        }
        //看牌
        lookPoker("a",player1);
        lookPoker("b",player2);
        lookPoker("c",player3);
        lookPoker("lord",lord);
    }

    public void lookPoker(String name,TreeSet<Integer> treeSet){
        System.out.print(name+":");
        for (int s : treeSet) {
            String poker = hm.get(s);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}

package com.niit.project;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //准备牌
    static ArrayList<String> list = new ArrayList<>();

    //静态代码块
    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame() {

        //洗牌
        Collections.shuffle(list);
//        System.out.println(list);
        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        //遍历牌盒，得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            if (i <= 2) {
                lord.add(poker);
            } else if (i % 3 == 0) {
                player1.add(poker);

            } else if (i % 3 == 1) {
                player2.add(poker);

            } else {
                player3.add(poker);

            }
        }
        //看牌
        lookPoker("a",player1);
        lookPoker("b",player2);
        lookPoker("c",player3);
        lookPoker("lord",lord);
    }
    public void lookPoker(String name,ArrayList<String> list){
        System.out.print(name+":");
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}

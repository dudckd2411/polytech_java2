package com.survivalcoding;

public class Cleric {
    String name;
    int hp = 50;
    int mp = 10;
    final int max_hp = 50;
    final int max_mp = 10;

    void selfAid() {
        mp -= 5;
        hp = max_hp;
        System.out.println("셀프 에이드");
    }

}

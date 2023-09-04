package com.workintech.abstraction.main;

import com.workintech.abstraction.rpg.Monster;
import com.workintech.abstraction.rpg.Troll;
import com.workintech.abstraction.rpg.Werewolf;

import java.sql.SQLOutput;

public class Console {
    public static void main(String[] args) {
        Monster troll=new Troll("X",500,40);
        System.out.println(troll.attack());

        Monster wereWolf=new Werewolf("Y",400,50);
        System.out.println(wereWolf.attack());
    }
}

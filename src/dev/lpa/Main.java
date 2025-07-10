package dev.lpa;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Player p1 = new Player("Rikard", 100, 50);
        Monster m1 = new Monster("Ragnaros", 100, 50);

        System.out.println("Player " + p1);
        System.out.println("Monster: " +m1);
        List<String> savedData = p1.write();
        List<String> savedDataMonster = m1.write();
        System.out.println("Saved player " + savedData);
        System.out.println("Saved monster " + savedDataMonster);
    }
}

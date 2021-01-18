package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic= new Magic(22,33,"stan");

        Medic medic = new Medic(23,25,"health");

        Warrior warrior = new Warrior(22,23,"damage");

        Hero[]heroes = new Hero[] {magic, medic, warrior};

        for (int i = 0; i < 3; i++) {
            heroes[i].applySuperAbility("");

        }



        }
    }

package com.company;

public class Warrior extends Hero {

    public Warrior(int health, int damage, String typeAbility) {
        super(health, damage, typeAbility);

    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Warrior ability: " + getTypeAbility());
    }
}

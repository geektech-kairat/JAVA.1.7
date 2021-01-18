package com.company;

public class Magic extends Hero {

    public Magic(int health, int damage, String typeAbility) {
        super(health, damage, typeAbility);

    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        super.applySuperAbility(superAbilityType);
        System.out.println("Маг ability: " + getTypeAbility());


    }
}


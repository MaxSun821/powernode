package com.max.oop8;

import java.util.Random;

public class Hero implements Character{
    private String name;
    private int health;
    private int attack;
    private int defense;

    public Hero() {
    }

    public Hero(String name, int health, int attack, int defense) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public boolean attack() {
        Random random = new Random();
        int randNumber = random.nextInt(10);
        if (randNumber % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean defense() {
        Random random = new Random();
        int randNumber = random.nextInt(10);
        if (randNumber % 2 == 0) {
            return true;
        }
        return false;
    }
}

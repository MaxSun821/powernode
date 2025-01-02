package com.max.oop8;

import java.util.Random;

public class MonsterImpl implements Monster{
    private String name;
    private int health;
    private int attack;
    private int defense;
    private String reward;

    public MonsterImpl() {
    }

    public MonsterImpl(String name, int health, int attack, int defense, String reward) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.reward = reward;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public String getReward() {
        return reward;
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
        if (randNumber % 3 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean defense() {
        Random random = new Random();
        int randNumber = random.nextInt(10);
        if (randNumber % 4 == 0) {
            return true;
        }
        return false;
    }
}

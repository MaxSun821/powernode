package com.max.oop8;

public class Test {
    public static void main(String[] args) {
        Hero h = new Hero("剑士", 30, 3, 2);
        MonsterImpl m = new MonsterImpl("骷髅王", 20, 4, 1, "100金币");

        while(h.getHealth() > 0 && m.getHealth() > 0) {
            if (!m.defense()) {
                int attack = h.getAttack() - m.getDefense();
                m.setHealth(m.getHealth() - attack);
                System.out.println("骷髅王遭受了" + attack + "点伤害，剩余血量：" + m.getHealth());
            }
            if (m.getHealth() <= 0) {
                System.out.println("剑士获胜，" + m.getReward());
                break;
            }
            if (!h.defense()) {
                int attack = m.getAttack() - h.getDefense();
                h.setHealth(h.getHealth() - attack);
                System.out.println("剑士遭受了" + attack + "点伤害，剩余血量：" + h.getHealth());
            }
            if (h.getHealth() <= 0) {
                break;
            }
        }
        System.out.println("Game Over");
    }
}

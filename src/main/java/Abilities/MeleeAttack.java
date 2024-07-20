package Abilities;

import Monsters.Monster;

public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker) {
        this.attacker = attacker;
    }
    public Integer attack(Monster monster){
        String message= attacker+" uses a melee attack on "+monster;
        System.out.println(message);
        return null;
    }
}

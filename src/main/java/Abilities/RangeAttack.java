package Abilities;

import Monsters.Monster;

public class RangeAttack implements Attack {
    Monster attacker;

    public RangeAttack(Monster attacker) {
        this.attacker = attacker;
    }
    public Integer attack(Monster monster){
        String message= attacker+" uses a range attack on "+monster;
        System.out.println(message);
        return null;
    }
}

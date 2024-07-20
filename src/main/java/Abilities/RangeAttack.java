package Abilities;

import Monsters.Monster;

public class RangeAttack implements Attack {
    Monster attacker;

    public RangeAttack(Monster attacker) {
        this.attacker = attacker;
    }
    public Integer attack(Monster target){
        String message= attacker+" uses a range attack on "+target;
        System.out.println(message);
        return attacker.getAgi()-target.getAgi();
    }
}

package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

public class Imp extends Monster {
    public Imp(Integer maxHP, Integer xp, HashMap<String,Integer> items){
        super(items,xp,maxHP);
        Integer maxStr=15;
        Integer maxDef=15;
        Integer maxAgi=3;

        attack=new MeleeAttack(this);
        str=super.getAttribute(str, maxStr);
        def=super.getAttribute(def, maxDef);
        agi=super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Imp has : " +super.toString();
    }
}

package Monsters;

import Abilities.MeleeAttack;
import Abilities.RangeAttack;

import java.util.HashMap;

public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String,Integer> items){
        super(items,xp,maxHP);
        Integer maxStr=15;
        Integer maxDef=15;
        Integer maxAgi=3;

        attack=new RangeAttack(this);
        str=super.getAttribute(str, maxStr);
        def=super.getAttribute(def, maxDef);
        agi=super.getAttribute(agi, maxAgi);
    }

    @Override
    public String toString() {
        return "Monsters.Kobold has : " +super.toString();
    }
}


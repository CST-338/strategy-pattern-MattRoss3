package Monsters;



import Abilities.Attack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public abstract class  Monster {
    private Integer hp;
    private Integer xp=10;
    private Integer maxHP;
    Integer agi=10;
    Integer def=10;
    Integer str=10;
    Attack attack;
    private HashMap<String, Integer> items;

    public Monster(HashMap<String,Integer> items, Integer xp, Integer maxHP) {
        this.items = items;
        this.xp = xp;
        this.maxHP = maxHP;
        hp=this.maxHP;
    }
    public Integer getAttribute(Integer min, Integer max) {
        Random rand = new Random();
        if(min>max){
            Integer temp= min;
            min=max;
            max=temp;
        }
        return rand.nextInt(max-min)+min;
    }
    Boolean takeDamage(Integer damage) {
        if(damage>0) {
            hp-=damage;
            System.out.println("The creature was hit for "+damage+" damage");
        }
        if(hp<=0) {
            System.out.println("Oh no! The creature has perished");
            this.toString();
            return false;
        }
        System.out.println(this);
        return true;
    }
    public Integer attackTarget(Monster target){
        int damage=attack.attack(target);
        target.takeDamage(damage);
        return damage;
    }

    public Integer getStr() {
        return str;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getAgi() {
        return agi;
    }

    @Override
    public String toString() {
        return  "hp="+hp+"/"+maxHP;
    }

    public Integer getHp() {
        return hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monster monster = (Monster) o;
        return Objects.equals(getHp(), monster.getHp()) && Objects.equals(getXp(), monster.getXp()) && Objects.equals(getMaxHP(), monster.getMaxHP()) && Objects.equals(getItems(), monster.getItems());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHp(), getXp(), getMaxHP(), getItems());
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }
}

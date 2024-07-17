import java.util.HashMap;
import java.util.Objects;

public abstract class Monster {
    private Integer hp;
    private Integer xp=10;
    private Integer maxHP;
    private HashMap<String, Integer> items;

    public Monster(HashMap<String,Integer> items, Integer xp, Integer maxHP) {
        this.items = items;
        this.xp = xp;
        this.maxHP = maxHP;
        hp=this.maxHP;
    }
    public String toString(){
        return "Monster has : hp="+hp+"/"+maxHP;
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

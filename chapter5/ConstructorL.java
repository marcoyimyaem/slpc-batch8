package chapter5;

public class ConstructorL {
    public static void main(String[] args) {
        Hero dfult = new Hero();
        System.out.println(dfult);
        Hero archer1 = new Hero(100, 120, 6, 3, 4, "Robin", 7);
        System.out.println(archer1);
        Hero dfult2 = new Hero(150);
        System.out.println(dfult2); //hp - atk = dmg sethp(gethp-atk)
    }
    
}

class Hero{

    @Override
    public String toString() {
        return "{" +
            " hp='" + getHp() + "'" +
            ", mp='" + getMp() + "'" +
            ", atk='" + getAtk() + "'" +
            ", range='" + getRange() + "'" +
            ", speed='" + getSpeed() + "'" +
            ", name='" + getName() + "'" +
            ", def='" + getDef() + "'" +
            "}";
    }
    int hp;
    int mp;
    int atk;
    int range;
    int speed;
    String name;
    int def;

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getAtk() {
        return this.atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getRange() {
        return this.range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDef() {
        return this.def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Hero(int hp, int mp, int atk, int range, int speed, String name, int def) {
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
        this.range = range;
        this.speed = speed;
        this.name = name;
        this.def = def;
        //model
        //scale
        //skills
    }
    Hero(){ //default hero
        hp = 100;
        mp=100;
        atk=5;
        range=1;
        speed=3;
        name="unknown";
        def=10;       
    }
    Hero(int hp){
        this();
        setHp(hp);
    }
    

}

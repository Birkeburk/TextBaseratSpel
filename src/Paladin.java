public class Paladin extends Character {

    public Paladin (int damage, int healthPionts, int manaPoints, int attackSpeed, int level){
        this.damage = damage;
        this.healthPoints = healthPionts;
        this.manaPoints = manaPoints;
        this.attackSpeed = attackSpeed;
        this.level = level;

    }
    void slash(){
        System.out.println("Slashhhh");
    }
}

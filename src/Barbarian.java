public class Barbarian extends Character {

    public Barbarian(int damage, int healthPoints, int manaPoints, int attackSpeed, int level){
        this.damage = damage;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.attackSpeed = attackSpeed;
        this.level = level;
    }
    public void whirlwind() {
        System.out.println("Whirlwind...");

    }
}

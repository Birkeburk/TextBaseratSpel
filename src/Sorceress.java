public class Sorceress extends Character {

    public Sorceress(int damage, int healthPoints, int manaPoints, int attackSpeed, int level){
        this.damage = damage;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.attackSpeed = attackSpeed;
        this.level = level;

    }

    void fireball(){
        System.out.println("Fireball!");
    }
}

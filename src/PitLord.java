public class PitLord extends Character{

    public PitLord(int damage, int healthPoints, int manaPoints, int attackSpeed, int level) {
        this.damage = damage;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.attackSpeed = attackSpeed;
        this.level = level;
    }
    void firebreath(){
        System.out.println("Pit Lord breaths fire!");
    }

}

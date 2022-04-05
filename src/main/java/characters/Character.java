package characters;

public abstract class Character {

    private double hitpoints;
    private double mana;
    private int stamina;
    private double basePhysicalDamage;
    private double baseMagicDamage;
    private double baseRangeDamage;
    private double baseEvadeChance;

    public Character(Double hitpoints, double mana, int stamina, double basePhysicalDamage, double baseMagicDamage,
                     double baseRangeDamage, double baseEvadeChance) {
        this.hitpoints = hitpoints;
        this.mana = mana;
        this.stamina = stamina;
        this.basePhysicalDamage = basePhysicalDamage;
        this.baseMagicDamage = baseMagicDamage;
        this.baseRangeDamage = baseRangeDamage;
        this.baseEvadeChance = baseEvadeChance;
    }

    public double getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(double hitpoints) {
        this.hitpoints = hitpoints;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public double getBasePhysicalDamage() {
        return basePhysicalDamage;
    }

    public void setBasePhysicalDamage(double basePhysicalDamage) {
        this.basePhysicalDamage = basePhysicalDamage;
    }

    public double getBaseMagicDamage() {
        return baseMagicDamage;
    }

    public void setBaseMagicDamage(double baseMagicDamage) {
        this.baseMagicDamage = baseMagicDamage;
    }

    public double getBaseRangeDamage() {
        return baseRangeDamage;
    }

    public void setBaseRangeDamage(double baseRangeDamage) {
        this.baseRangeDamage = baseRangeDamage;
    }

    public double getBaseEvadeChance() {
        return baseEvadeChance;
    }

    public void setBaseEvadeChance(double baseEvadeChance) {
        this.baseEvadeChance = baseEvadeChance;
    }
}

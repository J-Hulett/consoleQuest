package characters;

public class DarkElf extends Character{
    private double bonusMana = 1.15;

    public DarkElf(Double hitpoints, double mana, int stamina, double basePhysicalDamage, double baseMagicDamage,
                   double baseRangeDamage, double baseEvadeChance){
        super(hitpoints, mana, stamina, basePhysicalDamage, baseMagicDamage, baseRangeDamage,baseEvadeChance);
    }


}

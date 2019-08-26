package com.marvel;

public class Gods extends Characters
{
    private int godBonus;

   /**
    @param powerLevel power level from 1 to 10. Can exceed when God class object
    @param category e.g Hero, Villain, Unclassified
    @param universe e.g Marvel
    @param superName an alias
    @param realName a real name
    @param superPowers character's abilities
    @param godBonus an additional value for powerLevel. Applies to God class objects only
    */

   // A subclass constructor
    public Gods(int powerLevel, String category, String universe, String superName, String realName, String superPowers)
    {
        super(powerLevel, category, universe, superName, realName, superPowers);
        godBonus = 0;
    }

    // Get Power Level and add God bonus
    public int getPowerLevel()
    {
        int basicPowerLevel = super.getPowerLevel();
        return basicPowerLevel * godBonus;
    }

    // Set Power Level for a God object
    public void setPowerLevelGodBonus(int godBonus)
    {
        this.godBonus = godBonus;
    }
}
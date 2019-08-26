package com.marvel;

public class Characters
{
    // Fields - Characteristics
    private static int nextId = 0;
    private int id;
    private int powerLevel;
    private String universe;
    private String category;
    private String superName;
    private String realName;
    private String superPowers;

    /*
    A default constructor without parameters. Without it, IDE will not compile the code due to "There is no default
    constructor".
    */
    public Characters()
    {
        id = 0;
        powerLevel = 0;
        superName = "null";
        realName = "null";
        superPowers = "null";
    }

    // A rightous constructor
    public Characters(int powerLevel, String category, String universe, String superName, String realName, String superPowers)
    {
        this.id = 0;
        this.powerLevel = powerLevel;
        this.universe = universe;
        this.category = category;
        this.superName = superName;
        this.realName = realName;
        this.superPowers = superPowers;
    }

    // Get Power Level
    public int getPowerLevel()
    {
        return powerLevel;
    }

    // Get Universe
    public String getUniverse()
    {
        return universe;
    }

    // Get Category
    public String getCategory()
    {
        return category;
    }

    // Get Super Name
    public String getSuperName()
    {
        return superName;
    }

    // Get Real Name
    public String getRealName()
    {
        return realName;
    }

    // Get Real Name
    public String getSuperPowers()
    {
        return superPowers;
    }

    // Set ID
    public void setId()
    {
        id = nextId;
        nextId++;
    }

    // Get ID
    public int getNextId()
    {
        return nextId;
    }
}
package com.marvel;

/**
 * Heroes & Villans of Marvel
 * @version 1.0 2019-08-20
 * @author Adam K.
 */

public class HeroesVillains
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Heroes & Villains of Marvel!\n");

        // Create 1 hero
        Characters ironMan = new Characters(
                7,
                "Hero",
                "Marvel",
                "Iron Man",
                "Anthony Edward Stark",
                "Heightened Senses, Superhuman Strength, Regeneration, Genius, Intelligence");

        // Compile results
        ironMan.setId();

        // Display summary
        System.out.println(
                "ID: " + ironMan.getNextId() + " | "
                + "Category: " + ironMan.getCategory() + " | "
                + "Universe: " + ironMan.getUniverse() + " | "
                + "Super Name: " + ironMan.getSuperName() + " | "
                + "Real Name: " + ironMan.getRealName() + " | "
                + "Power Level: " + ironMan.getPowerLevel() + " | "
                + "Super Powers: " + ironMan.getSuperPowers());

        // Create 1 God, add God's bonus via method to the powerLevel
        Gods thor = new Gods(
                10,
                "Hero",
                "Marvel",
                "Thor",
                "Thor Odinson",
                "Odinpower, Warrior's Madness (Berserker Rage), Superhuman Strength, Superhuman Durability, Superhuman Speed, Superhuman Reflexes, Control of Elements, Hand-to-Hand Combat, Sword-Fighting");

        // Compile results
        thor.setId();
        thor.setPowerLevelGodBonus(5);

        // Display summary
        System.out.println(
                "ID: " + thor.getNextId() + " | "
                + "Category: " + thor.getCategory() + " | "
                + "Universe: " + thor.getUniverse() + " | "
                + "Super Name: " + thor.getSuperName() + " | "
                + "Real Name: " + thor.getRealName() + " | "
                + "Power Level: " + thor.getPowerLevel() + " | "
                + "Super Powers: " + thor.getSuperPowers());

        // Create 1 villain, add God's bonus via method to the powerLevel
        Gods thanos = new Gods(
                10,
                "Villan",
                "Marvel",
                "Thanos",
                "The Mad Titan Thanos",
                "Superhuman Strength, Superhuman Durability, Magic, Mysticism, Black Arts, Immortality");

        // Compile results
        thanos.setId();
        thanos.setPowerLevelGodBonus(10);

        // Display summary
        System.out.println(
                "ID: " + thanos.getNextId() + " | "
                + "Category: " + thanos.getCategory() + " | "
                + "Universe: " + thanos.getUniverse() + " | "
                + "Super Name: " + thanos.getSuperName() + " | "
                + "Real Name: " + thanos.getRealName() + " | "
                + "Power Level: " + thanos.getPowerLevel() + " | "
                + "Super Powers: " + thanos.getSuperPowers());
    }
}
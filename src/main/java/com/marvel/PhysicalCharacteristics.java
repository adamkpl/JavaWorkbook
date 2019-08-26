package com.marvel;

public class PhysicalCharacteristics extends Characters
{
    private double height;
    private double weight;
    private String race;
    private String skinColor;
    private String eyesColor;
    private String physicalCharacteristicsSummary;

    // A default constructor
    public PhysicalCharacteristics(double height, double weight, String race, String skinColor, String eyesColor)
    {
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.skinColor = skinColor;
        this.eyesColor = eyesColor;
        this.physicalCharacteristicsSummary = Double.toString(this.height) + "cm" + " / " + Double.toString(this.weight) + "kg" + " / " + this.race + " / " + this.skinColor + " / " + this.eyesColor;
    }

    // Print summary method
    public String displaySummary()
    {
        return this.physicalCharacteristicsSummary;
    }
}
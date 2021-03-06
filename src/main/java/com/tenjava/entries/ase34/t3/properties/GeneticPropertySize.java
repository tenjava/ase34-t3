package com.tenjava.entries.ase34.t3.properties;

public class GeneticPropertySize extends GeneticProperty {

    @Override
    public String getNBTKey() {
        return "size";
    }

    public int generateDeatlootBonus() {
        return (int) Math.round(1 - this.value + (Math.random() - 0.5) * 0.4);
    }
}

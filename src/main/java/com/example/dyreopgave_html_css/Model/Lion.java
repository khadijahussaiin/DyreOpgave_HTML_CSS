package com.example.dyreopgave_html_css.Model;

public class Lion {
    private String habitat;
    private String color;
    private String food;
    private String funFact;
    private double weight;

    public Lion(String habitat, String color, String food, String funFact, double weight) {
        this.habitat = habitat;
        this.color = color;
        this.food = food;
        this.funFact = funFact;
        this.weight = weight;
    }
    public String getHabitat() {
        return habitat;
    }
    public String getColor() {
        return color;
    }
    public String getFood() {
        return food;
    }
    public String getFunFact() {
        return funFact;
    }
    public double getWeight() {
        return weight;
    }
}


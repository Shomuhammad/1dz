package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefauitAge();
    private Sheltr sheltr;
    private EnumColor color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sheltr getSheltr() {
        return sheltr;
    }

    public void setSheltr(Sheltr sheltr) {
        this.sheltr = sheltr;
    }

    public EnumColor getColor() {
        return color;
    }

    public void setColor(EnumColor color) {
        this.color = color;
    }
    private int generateDefauitAge(){
        Random random = new Random();
        return random.nextInt(10) + 1;
    }
    public String getinfo(){
        return  "Age : " + age +
                "\nColor: " + color +
                "\nShelter name " + sheltr.getName()
                + "\nShelter address " + sheltr.getAddress();
    }
}

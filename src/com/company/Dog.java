package com.company;

import java.util.Arrays;

public final class Dog extends Pet{
    private String name,breed ;
    private String[] commands;

    public Dog(String name, String breed, String[] commands,
               EnumColor enumColor, Sheltr sheltr ) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setSheltr(sheltr);
        super.setColor(enumColor);
    }

    public Dog(String name, String breed, EnumColor color,Sheltr sheltr) {
        this.name = name;
        this.breed = breed;
        super.setSheltr(sheltr);
        super.setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
    void  makeVoice(String voice){

    }
    void  makeVoice(String voice, int count){
        for (int i = 0; i <count ; i++){
            System.out.println(voice);
        }
    }

    @Override
    public String getinfo() {
        return super.getinfo() +
                "\nName: " + name +
                "\nBreed: " + breed +
                "\nCommands: " + Arrays.toString(commands);
    }
}

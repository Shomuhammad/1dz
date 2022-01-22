package com.company;

public class Main {

    public static void main(String[] args) {
        Sheltr shelter = new Sheltr("Ромашка", "ул Первомайская 9");

        Dog rex = new Dog("Рекс", "Овчарка",
      new   String[]{"Бежать", "Лежать", "Стоять"},
                EnumColor.BROWN, shelter);
        System.out.println(rex.getinfo());
        rex.makeVoice("Гав гав", 3);

        System.out.println("_____________");


        Dog layka = new Dog("Ромашка", "Чихуахуа",EnumColor.BLACK , shelter);



    }
}

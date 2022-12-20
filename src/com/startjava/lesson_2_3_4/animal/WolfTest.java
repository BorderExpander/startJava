package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("Мужской");
        wolf.setName("Вульф");
        wolf.setWeight(50);
        wolf.setAge(4);
        wolf.setColor("Черный");

        System.out.println("Мы создали волка по имени " + wolf.getName() + ", пол " + wolf.getSex()
                + " ,весом в " + wolf.getWeight() + ", в возрасте 4" + ", окрас " + wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.howl();
    }
}
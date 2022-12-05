public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("Мужской");
        wolf.setName("Вульф");
        wolf.setWeight(50);
        wolf.setAge(4);
        wolf.setColor("Черный");

        System.out.println("Мы создали волка по имени " + wolf.name + ", пол " + wolf.sex 
                + " ,весом в " + wolf.weight + ", в возрасте 4" + ", окрас " + wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.howl();
    }
}
public class WolfTest {

    //String sex = "Мужской";
    //String name = "Вульф";
    //int weight = 50;
    //int age = 4;
    //String color = "Черный";


    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "Мужской";
        wolf.name = "Вульф";
        wolf.weight = 50;
        wolf.age = 4;
        wolf.color = "Черный";

        System.out.println("Мы создали волка по имени " + wolf.name + ", пол " + wolf.sex 
                +" ,весом в " + wolf.weight + ", в возрасте 4" + ", окрас " + wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.hunt();
        wolf.howl();
    }
}
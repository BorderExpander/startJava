public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Elemental", "Heavy", 130, 90, 90, 9);
        Jaeger jaeger2 = new Jaeger();

        jaeger2.setModelName("Destroyer");
        jaeger2.setType("Medium");
        jaeger2.setHeight(95);
        jaeger2.setWeight(55);
        jaeger2.setSpeed(120);
        jaeger2.setArmor(4);

        jaeger1.walk();
        jaeger2.run();

        System.out.println("\nИмя модели: " + jaeger1.getModelName());
        System.out.println("Вес: " + jaeger1.getWeight());
        System.out.println("Скорость: " + jaeger1.getSpeed());

        System.out.println("\nИмя модели: " + jaeger2.getModelName());
        System.out.println("Вес: " + jaeger2.getWeight());
        System.out.println("Скорость: " + jaeger2.getSpeed());

        jaeger1.setSpeed(jaeger2.getSpeed());
        jaeger2.setWeight(jaeger1.getWeight());

        System.out.println("\nИмя модели: " + jaeger1.getModelName());
        System.out.println("Вес: " + jaeger1.getWeight());
        System.out.println("Скорость: " + jaeger1.getSpeed());

        System.out.println("\nИмя модели: " + jaeger2.getModelName());
        System.out.println("Вес: " + jaeger2.getWeight());
        System.out.println("Скорость: " + jaeger2.getSpeed());
    }
}
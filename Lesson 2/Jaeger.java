public class Jaeger {

    String modelName;
    String type; //heavy, medium, light
    float height; //meters
    float weight; //tonns
    int speed; //km per hour
    int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String type, float height, float weight, int speed, int armor) {
        this.modelName = modelName;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.armor = armor;
        this.type = type;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void walk() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void hit() {
        System.out.println("Бьет");
    }

    public void run() {
        System.out.println("Бежит");
    }
}
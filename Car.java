public class Car {
    String name;
    String color;
    String bodyType;
    int weight;
    int numberOfDoors;

    public Car() {
    }

    public Car(String name, String color, String bodyType, int weight, int numberOfDoors) {
        this.name = name;
        this.color = color;
        this.bodyType = bodyType;
        this.weight = weight;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", weight=" + weight +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}


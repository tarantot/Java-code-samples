public class Dog {
    String name;
    String breed;
    int age;
    double weight;
    String sex;

    public Dog() {
    }

    public Dog(String name, String breed, int age, double weight, String sex) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}

public class Cat {
    String name;
    String breed;
    int age;
    double weight;
    String sex;

    public Cat() {
    }

    public Cat(String name, String breed, int age, double weight, String sex) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                '}';
    }
}

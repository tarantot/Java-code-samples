public class Start {
    public static void main(String[] args) {
        User user1 = new User ();
        System.out.println(user1);

        User user2 = new User ("Ivan", "Ivanov", 43, "ivannn@ukr.net",66,172, false, "male");
        System.out.println(user2);
    }
}

class User {
    String name = "John"; // name
    String surname = "Doe";
    int age = 30;
    String email = "johndoe@gmail.com"; // nickname
    double weight = 87.123; // weight
    double height = 187.6; // height
    boolean status = true; // status
    String sex = "male"; //sex
    String[] skills = ("java","python","MySQL","HTML/CSS")

    public User() {
        super();
    }

    @Override
    public String toString() {

    }
}

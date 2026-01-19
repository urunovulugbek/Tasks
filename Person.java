public class Person {
    String name, lastName;
    double hight, weight;
    public Person(String name, String lastName, double hight, double weight) {
        this.name = name;
        this.lastName = lastName;
        this.hight = hight;
        this.weight = weight;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Height: " + hight);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Person ulugbek = new Person("Ulugbek", "Urunov", 180, 58.7);
        ulugbek.showInfo();
    }
}

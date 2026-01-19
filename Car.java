import java.util.SortedMap;

public class Car {
    String model;
    String color;
    int price;
    String isAutomatic;

    public Car( String model, String color, int price, String isAutomatic) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    public void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + isAutomatic);
    }

    public static void main(String[] args) {
        Car bmw = new Car("BMW i5", "White", 85000, "Mecanic");
        bmw.showInfo();
    }
}
